function redirectToAnotherPage() {
    window.location.href = "/editarperfil";
}

//Salvar Alterações
// Função para carregar informações do localStorage
function loadProfileInfo() {
    const fullNameElement = document.querySelector('.full-name');
    const roleElement = document.querySelector('.role');
    const placeElement = document.querySelector('.place');
    const profileImage = document.querySelector('.img-container img');

    const storedFullName = localStorage.getItem('fullName');
    const storedRole = localStorage.getItem('role');
    const storedPlace = localStorage.getItem('place');
    const storedImageBase64 = localStorage.getItem('image');

    if (storedFullName) {
        fullNameElement.textContent = storedFullName;
    }

    if (storedRole) {
        roleElement.innerHTML = `<i class="fas fa-star"></i>${storedRole}`;
    }

    if (storedPlace) {
        placeElement.innerHTML = `<i class="fas fa-map-marker-alt"></i>${storedPlace}`;
    }

    if (storedImageBase64) {
        profileImage.src = `data:image/png;base64,${storedImageBase64}`;
    }
}

// Chamar a função para carregar as informações
loadProfileInfo();
perfilmentorado.css

