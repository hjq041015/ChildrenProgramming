"use strict";

// :: Header
// ¸ü¶àÏÂÔØ£ºhttps://www.bootstrapmb.com 
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

function mobileDropdownMenu() {
    let sbdropdown = document.querySelectorAll('.dropdown-list').length;

    if (sbdropdown > 0) {
        let navUrl = document.querySelectorAll('.navbar-nav li ul');
        let navUrlLen = navUrl.length;

        for (let i = 0; i < navUrlLen; i++) {
            navUrl[i].insertAdjacentHTML('beforebegin', '<div class="dropdown-toggler"><i class="icon-down-arrow-1"></i></div>');
        }

        let ddtroggler = document.querySelectorAll('.dropdown-toggler');
        let ddtrogglerlen = ddtroggler.length;

        for (let i = 0; i < ddtrogglerlen; i++) {
            ddtroggler[i].addEventListener('click', function () {
                let ddNext = ddtroggler[i].nextElementSibling;
                slideToggle(ddNext, 300);
            });
        }
    }
}

window.addEventListener('load', mobileDropdownMenu);

// :: Venobox JS
const venoBox = document.querySelectorAll(".venobox");

if (venoBox.length > 0) {
    new VenoBox({
        overlayColor: "rgba(18,2,69,0.725)",
        spinner: "flow"
    });
}


// :: Smooth Scroll to Top 

// if ($('#smooth-body').length && $('#smooth-content').length) {
//     gsap.registerPlugin(ScrollTrigger, ScrollSmoother, TweenMax, ScrollToPlugin);

//     gsap.config({
//         nullTargetWarn: false,
//     });

//     let smoother = ScrollSmoother.create({
//         smooth: 2,
//         effects: true,
//         smoothTouch: 0.1,
//         normalizeScroll: false,
//         ignoreMobileResize: true,
//     });

// }

// :: Scroll to Top

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

// :: Client Slider Active

var serviceOne = new Swiper('.client-active-1', {
    slidesPerView: 2,
    spaceBetween: 70,
    loop: true,
    autoplay: {
        delay: 3000,
    },
    pagination: {
        el: ".service-swiper-dot",
        clickable: true,
    },
    navigation: {
        nextEl: ".client-active-1-button-next",
        prevEl: ".client-active-1-button-prev",
    },
    breakpoints: {
        '1200': {
            slidesPerView: 2,
            spaceBetween: 50,
        },
        '992': {
            slidesPerView: 1,
        },
        '768': {
            slidesPerView: 2,
            spaceBetween: 30,
        },
        '576': {
            slidesPerView: 1,
        },
        '0': {
            slidesPerView: 1,
        },
    },
    speed: 3000
});

// :: Client 2 Slider Active

var serviceTwo = new Swiper('.client-active-2', {
    slidesPerView: 1,
    spaceBetween: 70,
    loop: true,
    autoplay: {
        delay: 3000,
    },
    pagination: {
        el: ".service-swiper-dot",
        clickable: true,
    },
    navigation: {
        nextEl: ".client-active-1-button-next",
        prevEl: ".client-active-1-button-prev",
    },
    breakpoints: {
        '0': {
            slidesPerView: 1,
        },
    },
    speed: 3000
});

// :: Client 3 Slider Active
var serviceTwo = new Swiper('.client-active-3', {
    slidesPerView: 3,
    spaceBetween: 30,
    loop: true,
    autoplay: {
        delay: 1500,
    },
    breakpoints: {
        '1200': {
            slidesPerView: 3,
            spaceBetween: 30,
        },
        '992': {
            slidesPerView: 3,
        },
        '768': {
            slidesPerView: 2,
            spaceBetween: 30,
        },
        '576': {
            slidesPerView: 1,
        },
        '0': {
            slidesPerView: 1,
        },
    },
    speed: 3000
});

// :: Program Slider Active
var serviceFour = new Swiper('.program-active-1', {
    slidesPerView: 4,
    spaceBetween: 30,
    loop: true,
    autoplay: {
        delay: 1500,
    },
    breakpoints: {
        '1200': {
            slidesPerView: 4,
        },
        '992': {
            slidesPerView: 3,
        },
        '768': {
            slidesPerView: 2,
        },
        '576': {
            slidesPerView: 1,
        },
        '0': {
            slidesPerView: 1,
        },
    },
    speed: 3000
});

// :: Gallery  Slider Active
var serviceThree = new Swiper('.gallery-active-1', {
    slidesPerView: 5,
    spaceBetween: 0,
    loop: true,
    autoplay: {
        delay: 1600,
    },
    breakpoints: {
        '1200': {
            slidesPerView: 5,
            spaceBetween: 0,
        },
        '992': {
            slidesPerView: 4,
        },
        '768': {
            slidesPerView: 3,
            spaceBetween: 0,
        },
        '576': {
            slidesPerView: 2,
        },
        '0': {
            slidesPerView: 1,
        },
    },
    speed: 3000
});

// :: Home 3 hero Slider

if (document.querySelectorAll('.photography-slide').length > 0) {
    tns({
        'container': '.photography-slide',
        'items': 1,
        'gutter': 0,
        'slideBy': 1,
        'autoplay': false,
        'autoplayButtonOutput': false,
        'autoplayTimeout': 5000,
        'speed': 500,
        "mode": "gallery",
        "animateIn": "fadeIn",
        "animateOut": "fadeOut",
        'loop': true,
        'mouseDrag': true,
        'nav': true,
        "navAsThumbnails": true,
        "navContainer": "#customize-thumbnails",
        'controls': false,

    });
}


if (document.querySelectorAll('.client-slide').length > 0) {
    tns({
        'container': '.client-slide',
        'items': 1,
        'gutter': 0,
        'slideBy': 1,
        'autoplay': false,
        'autoplayButtonOutput': false,
        'autoplayTimeout': 5000,
        'speed': 500,
        "mode": "gallery",
        "animateIn": "fadeIn",
        "animateOut": "fadeOut",
        'loop': true,
        'mouseDrag': true,
        'nav': true,
        "navAsThumbnails": true,
        "navContainer": "#customize-thumbnails1",
        'controls': false,

    });
}


// :: Btn Click
function toggleBox() {
    const box = document.getElementById('box');
    if (box.style.display === 'none' || box.style.display === '') {
        box.style.display = 'block';
    } else {
        box.style.display = 'none';
    }
}

// :: Prevent default "a" click

let anchor = document.querySelectorAll('a[href="#"]');
let anchorLength = anchor.length;

if (anchorLength > 0) {
    for (let i = 0; i < anchorLength; i++) {
        anchor[i].addEventListener('click', function (e) {
            e.preventDefault();
        });
    }
}


/*------------------------------------------
        = CONTACT FORM SUBMISSION
    -------------------------------------------*/
    if ($("#contact-form-mejor").length) {
        $("#contact-form-mejor").validate({
            rules: {
                name: {
                    required: true,
                    minlength: 2
                },
                email: "required",
                phone: "required",
                subject: {
                    required: true
                }
            },
            messages: {
                name: "Please enter your name",
                email: "Please enter your email address",
                phone: "Please enter your phone number",
                subject: "Please select your contact subject"
            },
            submitHandler: function (form) {
                $.ajax({
                    type: "POST",
                    url: "email.php",
                    data: $(form).serialize(),
                    success: function () {
                        $("#loader").hide();
                        $("#success").slideDown("slow");
                        setTimeout(function () {
                            $("#success").slideUp("slow");
                        }, 3000);
                        form.reset();
                    },
                    error: function () {
                        $("#loader").hide();
                        $("#error").slideDown("slow");
                        setTimeout(function () {
                            $("#error").slideUp("slow");
                        }, 3000);
                    }
                });
                return false; // required to block normal submit since you used ajax
            }
        });
    }


