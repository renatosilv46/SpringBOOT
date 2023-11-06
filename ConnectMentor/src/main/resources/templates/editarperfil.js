/* Pretensões */

function togglePretensions() {
    const pretensionsList = document.getElementById('pretensions-list');
    pretensionsList.classList.toggle('visible');
}

/* Botão Voltar */

function redirectToAnotherPage() {
    window.location.href = "mentorado/perfilMentorado";
}

/* Editar Informações */

function enableInfoEditing() {
    const fullNameElement = document.querySelector('.full-name');
    const roleElement = document.querySelector('.role');
    const placeElement = document.querySelector('.place');

    fullNameElement.contentEditable = true;
    roleElement.contentEditable = true;
    placeElement.contentEditable = true;

    fullNameElement.focus(); // Foca no elemento do nome para começar a edição
}

const editNameButton = document.getElementById('edit-name-button');
editNameButton.addEventListener('click', enableInfoEditing);

/* Adicionar Fotos */

function handleImageUpload() {
    const imageUpload = document.getElementById('image-upload');
    imageUpload.click(); // Aciona o input de upload de imagem
}

function handleImageChange(event) {
    const image = document.querySelector('.img-container img');
    const file = event.target.files[0];

    if (file) {
        const reader = new FileReader();
        reader.onload = function(e) {
            image.src = e.target.result;
        };
        reader.readAsDataURL(file);
    }
}

const changePhotoButton = document.getElementById('change-photo-button');
changePhotoButton.addEventListener('click', handleImageUpload);

const imageUpload = document.getElementById('image-upload');
imageUpload.addEventListener('change', handleImageChange);

/* Função para converter a imagem para base64 */
function getBase64Image(img) {
    const canvas = document.createElement('canvas');
    const ctx = canvas.getContext('2d');
    canvas.width = img.width;
    canvas.height = img.height;
    ctx.drawImage(img, 0, 0);
    const dataURL = canvas.toDataURL('image/png');
    return dataURL.replace(/^data:image\/(png|jpg);base64,/, '');
}

/* Botão de Salvar Alterações */

// Adiciona um event listener para o botão "Salvar"
const saveButton = document.getElementById('save-button');
saveButton.addEventListener('click', saveAndRedirect);

// Função para salvar as informações e redirecionar
function saveAndRedirect() {
    console.log('Botão Salvar clicado.');

    const fullNameElement = document.querySelector('.full-name');
    const roleElement = document.querySelector('.role');
    const placeElement = document.querySelector('.place');
    const imageElement = document.querySelector('.img-container img');

    const updatedFullName = fullNameElement.textContent;
    const updatedRole = roleElement.textContent;
    const updatedPlace = placeElement.textContent;

    // Salvar a imagem em formato base64
    const imageBase64 = getBase64Image(imageElement);

    // Salvar as informações no localStorage
    localStorage.setItem('image', imageBase64);
    localStorage.setItem('fullName', updatedFullName);
    localStorage.setItem('role', updatedRole);
    localStorage.setItem('place', updatedPlace);

    // Atualizar informações diretamente na página editarperfil.html
    document.querySelector('.full-name').textContent = updatedFullName;
    document.querySelector('.role').textContent = updatedRole;
    document.querySelector('.place').textContent = updatedPlace;

    // Construindo a URL com os parâmetros atualizados
    const redirectURL = `mentorado/perfilMentorado?fullName=${encodeURIComponent(updatedFullName)}&role=${encodeURIComponent(updatedRole)}&place=${encodeURIComponent(updatedPlace)}`;

    // Armazenar os dados na sessionStorage para acessá-los no perfilmentorado.html
    sessionStorage.setItem('redirectURL', redirectURL);
    sessionStorage.setItem('imageBase64', imageBase64);

    // Redirecionar para o perfilmentorado.html
    window.location.href = 'mentorado/perfilMentorado';
}

// Carregar informações do localStorage ao carregar a página
window.addEventListener('load', function () {
    const fullNameElement = document.querySelector('.full-name');
    const roleElement = document.querySelector('.role');
    const placeElement = document.querySelector('.place');
    const imageElement = document.querySelector('.img-container img');

    const storedFullName = localStorage.getItem('fullName');
    const storedRole = localStorage.getItem('role');
    const storedPlace = localStorage.getItem('place');
    const storedImageBase64 = localStorage.getItem('image');

    if (storedFullName) {
        fullNameElement.textContent = storedFullName;
    }
    if (storedRole) {
        roleElement.textContent = storedRole;
    }
    if (storedPlace) {
        placeElement.textContent = storedPlace;
    }
    if (storedImageBase64) {
        imageElement.src = `data:image/png;base64,${storedImageBase64}`;
    }
});