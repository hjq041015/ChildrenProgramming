(function ($) {
	("use strict")

	// :: preloader

	$(window).on('load', function () {
		$('#preloader-active').delay(450).fadeOut('slow');
		$('body').delay(450).css({
		});
	});

	// :: Body overlay Js
	$(".body-overlay").on("click", function () {
		$(".offcanvas__area").removeClass("offcanvas-opened");
		$(".vw-search-area").removeClass("opened");;
		$(".body-overlay").removeClass("opened");
	});

	// :: Search Header Js
	$(".search-toggle-open").on("click", function () {
		$(".vw-search-area").addClass("opened");
		$(".body-overlay").addClass("opened");
	});
	$(".tp-search-close-btn").on("click", function () {
		$(".vw-search-area").removeClass("opened");
		$(".body-overlay").removeClass("opened");
	});

	// :: Slider Active
	if ($.fn.owlCarousel) {
		var cateSlider = $('.cate-slider-area');
		cateSlider.owlCarousel({
			items: 4,
			loop: true,
			autoplay: false,
			autoplayTimeout: 3000,
			smartSpeed: 1000,
			margin: 30,
			dots: true,
			nav: false,
			responsive: {
				0: {
					items: 1,
				},
				600: {
					items: 2,

				},
				992: {
					items: 3,

				},
				1200: {
					items: 4,

				}
			}
		})
	}

	// :: Partner Slider Active
	if ($.fn.owlCarousel) {
		var partSlider = $('.partner-slider-2');
		partSlider.owlCarousel({
			items: 4,
			loop: true,
			autoplay: true,
			autoplayTimeout: 3000,
			smartSpeed: 1000,
			margin: 100,
			dots: false,
			nav: false,
			responsive: {
				0: {
					items: 2,
					margin:30
				},
				576: {
					items: 2,

				},
				992: {
					items: 4,

				},
				1200: {
					items: 5,

				}
			}
		})
	}

	// :: Partner Slider Active
	if ($.fn.owlCarousel) {
		var partSlider = $('.partner-slider');
		partSlider.owlCarousel({
			items: 4,
			loop: true,
			autoplay: true,
			autoplayTimeout: 3000,
			smartSpeed: 1000,
			margin: 100,
			dots: false,
			nav: false,
			responsive: {
				0: {
					items: 1,
				},
				576: {
					items: 2,

				},
				992: {
					items: 4,

				},
				1200: {
					items: 5,

				}
			}
		})
	}



	// :: Partner Slider Active
	if ($.fn.owlCarousel) {
		var partSlider1 = $('.partner-area-content');
		partSlider1.owlCarousel({
			items: 5,
			loop: true,
			autoplay: true,
			autoplayTimeout: 3000,
			smartSpeed: 1000,
			margin: 70,
			dots: false,
			nav: false,
			responsive: {
				0: {
					items: 2,
					margin: 30,
				},
				576: {
					items: 4,
					margin: 40,
				},
				992: {
					items: 3,

				},
				1200: {
					items: 5,

				}
			}
		})
	}


	// :: Isotope
	if ($.fn.imagesLoaded) {
		$('.gallery-area').imagesLoaded(function () {
			var $grid = $('.gallery-area').isotope({
				itemSelector: '.col-12',
				percentPosition: true
			});
		});
	}

	// :: MagnificPopup video btn
	if ($.fn.magnificPopup) {
		$('.popup-video').magnificPopup({
			type: 'image',
			gallery: {
				enabled: true
			}
		});
	}

	// :: Counter js
	if ($.fn.counterUp) {
		$('.counter').counterUp({
			delay: 10,
			time: 1000,
		});
	}

	// :: Wow Js
	new WOW().init();


})(jQuery);


