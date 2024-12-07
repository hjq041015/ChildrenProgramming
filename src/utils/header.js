export function useHeaderSticky() {
    let header = document.getElementById('header');
    let navbarToggler = document.getElementById('navbarToggler');

if (header) {
    let prevScrollPosition = window.pageYOffset;

    function stickyHeader() {
        if (window.pageYOffset > 70) {
            header.classList.add("sticky");
        } else {
            header.classList.remove("sticky");
        }
    }

    window.addEventListener('load', stickyHeader);
    window.addEventListener('scroll', stickyHeader);

    navbarToggler.addEventListener('click', function () {
        header.classList.toggle("mobile-menu-opened");
    });
}
}
