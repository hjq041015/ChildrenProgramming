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

export function useBactToTop() {
    let scrollButton = document.getElementById('scrollToTop');
    let topdistance = 600;

    if (scrollButton) {
        window.addEventListener('scroll', function () {
            if (document.body.scrollTop > topdistance || document.documentElement.scrollTop > topdistance) {
                scrollButton.classList.add('scrolltop-show');
                scrollButton.classList.remove('scrolltop-hide');
            } else {
                scrollButton.classList.add('scrolltop-hide');
                scrollButton.classList.remove('scrolltop-show');
            }
        });

        scrollButton.addEventListener('click', function () {
            window.scrollTo({
                top: 0,
                left: 0,
                behavior: 'smooth'
            });
        });
    }
}