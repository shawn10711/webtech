document.addEventListener('DOMContentLoaded', function () {
    const radios = document.querySelectorAll('input[type="radio"]');
    const slider = document.querySelector('.slider');

    radios.forEach((radio) => {
        radio.addEventListener('change', () => {
            const radioId = radio.getAttribute('id').replace('slide', '');
            slider.style.transform = `translateX(-${radioId - 1}00%)`;
        });
    });
});
