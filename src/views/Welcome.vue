<script setup>
const vips = [
  {
    id: 1,
    name: '普通会员',
    price: '35',
    limit: 1,
    disable: ['vip1', 'vip2', "vip3"],
    colorClass: [],
    desc: ['少儿编程基础课程免费学习', '线下老师一对一指导', '免费使用少儿编程开发器件', '全天候在线咨询服务', '更多在线直播课程']
  }, {
    id: 2,
    name: '黄金会员',
    price: '100',
    limit: 1,
    disable: ['vip2', "vip3"],
    colorClass: ['two'],
    desc: [
      '少儿编程全套课程免费学习', '线下老师一对一指导', '免费使用少儿编程开发器件', '全天候在线咨询服务', '更多在线直播课程',
      '每周一次家庭教育服务', '周一到周五放学托管服务'
    ]
  }
]
</script>

<template>
  <div>
    <div class="hero-area-2">
      <!-- Shape -->
      <div class="hero-2-curbe-shape">
        <img src="/img/bg-img/hero-2-shape.png" alt="">
      </div>
      <div class="hero-2-shape-1 wow fadeInDown" data-wow-delay="900ms" style="visibility: visible; animation-delay: 900ms; animation-name: fadeInDown;">
        <img src="/img/bg-img/home-2/shape-1.png" alt="">
      </div>

      <div class="hero-2-shape-2">
        <img src="/img/bg-img/home-2/shape-2.png" alt="">
      </div>

      <div class="hero-2-shape-3">
        <img src="/img/bg-img/home-2/shape-4.png" alt="">
      </div>

      <div class="container h-100">
        <div class="row h-100 align-items-center justify-content-between">
          <div class="col-lg-5">
            <!-- Content text -->
            <div class="hero-content-text">
              <h6 class="wow fadeInUp" data-wow-delay="500ms" style="visibility: visible; animation-delay: 500ms; animation-name: fadeInUp;"><i class="icon-icon_document_alt"></i>
                欢迎加入柏码</h6>
              <h2 class="wow fadeInUp" data-wow-delay="900ms" style="visibility: visible; animation-delay: 900ms; animation-name: fadeInUp;">开心少儿编程俱乐部
              </h2>
              <div class="hero-btn-area mt-5 wow fadeInUp" data-wow-delay="1300ms" style="visibility: visible; animation-delay: 1300ms; animation-name: fadeInUp;">
                <a class="btn-1" href="about.html">了解更多 <span class="icon-right-arrow-11"></span></a>
              </div>
            </div>
          </div>
          <div class="col-lg-7">
            <div class="welcome-img-2 text-center relative">
              <img class="wel-img-2 wow fadeInUp" data-wow-delay="500ms" src="/img/bg-img/hero-2.png" alt="" style="visibility: visible; animation-delay: 500ms; animation-name: fadeInUp;">
              <div class="shape-box">
                <img src="/img/bg-img/home-2/shape-5.png" alt="">
              </div>
              <div class="bag-shape wow fadeInLeft" data-wow-delay="1000ms" style="visibility: visible; animation-delay: 1000ms; animation-name: fadeInLeft;">
                <img src="/img/bg-img/home-2/shape-3.png" alt="">
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="care-program-area">
      <div class="container">
        <div class="row justify-content-center">
          <!-- title -->
          <div class="col-lg-6">
            <div class="section-title-area text-center wow fadeInDown" data-wow-delay="500ms" style="visibility: visible; animation-delay: 500ms; animation-name: fadeInDown;">
              <h6>能学到什么？</h6>
              <h2 class="mb-0">少儿编程课程安排</h2>
            </div>
          </div>
        </div>

        <div class="row">
          <!-- Single Card -->
          <div class="col-md-6 col-lg-4">
            <div class="single-care-card relative text-center wow fadeInLeft" data-wow-delay="700ms" style="visibility: visible; animation-delay: 700ms; animation-name: fadeInLeft;">
              <div class="care-shape wow fadeInDown" data-wow-delay="1400ms" style="visibility: visible; animation-delay: 1400ms; animation-name: fadeInDown;">
                <img src="/img/bg-img/home-2/care-shap.png" alt="">
              </div>
              <div class="care-card-img-content">
                <div class="care-img">
                  <img src="/img/bg-img/care-1.jpeg.jpg" alt="">
                </div>

                <div class="care-content-text">
                  <h4>Java全套实战路线</h4>
                  <p>从JavaSE入门开始学习，接着是JavaWeb网页后端开发，JSP大学课设折磨，SSM框架学习，SpringBoot一步到位，SpringCloud天天更新</p>
                  <div class="care-count-info">
                    <p class="mb-0"><span>课时:</span> 约2小时45分钟</p>
                  </div>
                </div>
              </div>
            </div>
          </div>

          <!-- Single Card -->
          <div class="col-md-6 col-lg-4">
            <div class="single-care-card relative text-center wow fadeInLeft" data-wow-delay="900ms" style="visibility: visible; animation-delay: 900ms; animation-name: fadeInLeft;">
              <div class="care-shape wow fadeInDown" data-wow-delay="1400ms" style="visibility: visible; animation-delay: 1400ms; animation-name: fadeInDown;">
                <img src="/img/bg-img/home-2/care-shap.png" alt="">
              </div>
              <div class="care-card-img-content">
                <div class="care-img">
                  <img src="/img/bg-img/care-2.jpeg.jpg" alt="">
                </div>

                <div class="care-content-text">
                  <h4>Scratch模块编程</h4>
                  <p>适用于中国宝宝体制的，少儿编程软件，像拼图一样进行程序开发和设计，网页上可以出现动画实时交互</p>
                  <div class="care-count-info">
                    <p class="mb-0"><span>课时:</span> 约2小时45分钟</p>
                  </div>
                </div>
              </div>
            </div>
          </div>

          <!-- Single Card -->
          <div class="col-md-6 col-lg-4">
            <div class="single-care-card relative text-center wow fadeInLeft" data-wow-delay="1100ms" style="visibility: visible; animation-delay: 1100ms; animation-name: fadeInLeft;">
              <div class="care-shape wow fadeInDown" data-wow-delay="1400ms" style="visibility: visible; animation-delay: 1400ms; animation-name: fadeInDown;">
                <img src="/img/bg-img/home-2/care-shap.png" alt="">
              </div>
              <div class="care-card-img-content">
                <div class="care-img">
                  <img src="/img/bg-img/care-3.jpeg.jpg" alt="">
                </div>

                <div class="care-content-text">
                  <h4>树莓派单片机编程</h4>
                  <p>使用Python加树莓派进行编程开发，学习机器视觉，AI人工智能，制造智能小车，编写小车循迹算法</p>
                  <div class="care-count-info">
                    <p class="mb-0"><span>课时:</span> 约2小时45分钟</p>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="popular-cate-2-area bg-img bg-overlay relative" style="background-image: url(/img/bg-img/popular.png);">
      <div class="cate-2-shape wow fadeInRight" data-wow-delay="1200ms" style="visibility: visible; animation-delay: 1200ms; animation-name: fadeInRight;">
        <img src="/img/bg-img/home-2/shape-6.png" alt="">
      </div>
      <div class="container">
        <div class="row">
          <div class="col-lg-4">
            <div class="section-title-area cate-heading">
              <h6 class="wow fadeInDown" data-wow-delay="500ms" style="visibility: visible; animation-delay: 500ms; animation-name: fadeInDown;">欢迎加入我们</h6>
              <h2 class="wow fadeInDown" data-wow-delay="700ms" style="visibility: visible; animation-delay: 700ms; animation-name: fadeInDown;">加入少儿编程俱乐部，让自己的孩子赢在起跑线</h2>
              <p class="mb-5 wow fadeInDown" data-wow-delay="900ms" style="visibility: visible; animation-delay: 900ms; animation-name: fadeInDown;">
                现在加入会员，还送价值288的入会大礼包，双十一特惠活动
              </p>
              <a class="btn-1 wow fadeInDown" data-wow-delay="1100ms" href="#" style="visibility: visible; animation-delay: 1100ms; animation-name: fadeInDown;">了解更多 <span class="icon-right-arrow-11"></span></a>
            </div>
          </div>

          <div class="col-md-6 col-lg-4" v-for="vip in vips">
            <div class="cate-price-card wow fadeInUp" :class="vip.colorClass"
                 data-wow-delay="700ms" style="visibility: visible; animation-delay: 700ms; animation-name: fadeInUp;">
              <div class="cate-price-body">
                <h2>
                  {{ vip.name }} <br>
                  <span class="cate-price-title">￥{{ vip.price }} /</span>
                  <span class="month-desc">月</span>
                </h2>
                <h6>{{ vip.limit }} 个小朋友可用</h6>
                <ul>
                  <li v-for="item in vip.desc">{{ item }}</li>
                </ul>

                <div class="price-btn-area">
                  <a class="price-btn" href="/course/vip">
                    立即购买 <span class="icon-right-arrow-11"></span></a>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="certificate-area relative">
      <!-- Shape -->
      <div class="gra-shape-1 wow fadeInDown" data-wow-delay="700ms" style="visibility: visible; animation-delay: 700ms; animation-name: fadeInDown;">
        <img src="/img/bg-img/home-2/shape-7.png" alt="">
      </div>
      <div class="gra-shape-2">
        <img src="/img/bg-img/home-2/shape-8.png" alt="">
      </div>
      <div class="gra-shape-3 wow fadeInRight" data-wow-delay="1000ms" style="visibility: visible; animation-delay: 1000ms; animation-name: fadeInRight;">
        <img src="/img/bg-img/home-2/shape-9.png" alt="">
      </div>
      <div class="gra-shape-4">
        <img src="/img/bg-img/home-2/shape-10.png" alt="">
      </div>
      <div class="container">
        <div class="row">
          <div class="col-lg-6">
            <div class="gra-cert-image-area relative">
              <div class="certi-img relative wow fadeInRight" data-wow-delay="500ms" style="visibility: visible; animation-delay: 500ms; animation-name: fadeInRight;">
                <div class="gra-img-1 relative">
                  <img src="/img/bg-img/home-2/g-1.png" alt="">
                </div>
              </div>
              <div class="certi-img-2 wow fadeInLeft" data-wow-delay="700ms" style="visibility: visible; animation-delay: 700ms; animation-name: fadeInLeft;">
                <div class="gra-img-2">
                  <img src="/img/bg-img/home-2/g-2.png" alt="">
                </div>
              </div>

              <div class="play-btn">
                <div class="video_player_btn">
                  <a href="https://www.youtube.com/watch?v=eEzD-Y97ges" class="popup-video"><span class="icon-Polygon-1"></span></a>
                </div>
              </div>
            </div>
          </div>

          <div class="col-lg-6">
            <div class="certi-title-area wow fadeInRight" data-wow-delay="900ms" style="visibility: visible; animation-delay: 900ms; animation-name: fadeInRight;">
              <h6 class="certi-sub-title"><span class="icon-open-book-1"></span> Guaranteed and
                certified</h6>
              <h2>Online Learning Wherever &amp; whenever.</h2>

              <!-- Single Card -->
              <div class="certi-single-card d-flex align-items-center">
                <div class="certi-border border--primary">
                  <div class="certi-icon bg--primary">
                    <img src="/img/bg-img/icons/g-1.png" alt="">
                  </div>
                </div>
                <div class="certi-card-info">
                  <h4>Full day session</h4>
                  <p>All membership plans come with a 30-day satisfaction guarantee.</p>
                </div>
              </div>

              <!-- Single Card -->
              <div class="certi-single-card d-flex align-items-center">
                <div class="certi-border border--second">
                  <div class="certi-icon bg--second">
                    <img src="/img/bg-img/icons/g-2.png" alt="">
                  </div>
                </div>
                <div class="certi-card-info">
                  <h4>Knowledge Classes</h4>
                  <p>All membership plans come with a 30-day satisfaction guarantee.</p>
                </div>
              </div>

              <!-- Single Card -->
              <div class="certi-single-card d-flex align-items-center">
                <div class="certi-border border--navy">
                  <div class="certi-icon bg--navy">
                    <img src="/img/bg-img/icons/g-1.png" alt="">
                  </div>
                </div>
                <div class="certi-card-info">
                  <h4>Last minute request</h4>
                  <p>All membership plans come with a 30-day satisfaction guarantee.</p>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="partner-area-2 wow fadeInUp" data-wow-delay="700ms" style="visibility: visible; animation-delay: 700ms; animation-name: fadeInUp;">
      <div class="container-fluid">
        <div class="row">
          <div class="col-12">
            <!-- Slider -->
            <div class="partner-slider owl-carousel owl-loaded owl-drag">
              <!-- Single Slider -->

              <!-- Single Slider -->

              <!-- Single Slider -->

              <!-- Single Slider -->

              <!-- Single Slider -->

              <div class="owl-stage-outer"><div class="owl-stage" style="transform: translate3d(-1220px, 0px, 0px); transition: 1s; width: 3965px;"><div class="owl-item cloned" style="width: 205px; margin-right: 100px;"><div class="single-slider">
                <a href="#"><img src="/img/bg-img/home-2/s-2.png" alt=""></a>
              </div></div><div class="owl-item cloned" style="width: 205px; margin-right: 100px;"><div class="single-slider">
                <a href="#"><img src="/img/bg-img/home-2/s-3.png" alt=""></a>
              </div></div><div class="owl-item cloned" style="width: 205px; margin-right: 100px;"><div class="single-slider">
                <a href="#"><img src="/img/bg-img/home-2/s-4.png" alt=""></a>
              </div></div><div class="owl-item cloned" style="width: 205px; margin-right: 100px;"><div class="single-slider">
                <a href="#"><img src="/img/bg-img/home-2/s-3.png" alt=""></a>
              </div></div><div class="owl-item active" style="width: 205px; margin-right: 100px;"><div class="single-slider">
                <a href="#"><img src="/img/bg-img/home-2/s-1.png" alt=""></a>
              </div></div><div class="owl-item active" style="width: 205px; margin-right: 100px;"><div class="single-slider">
                <a href="#"><img src="/img/bg-img/home-2/s-2.png" alt=""></a>
              </div></div><div class="owl-item active" style="width: 205px; margin-right: 100px;"><div class="single-slider">
                <a href="#"><img src="/img/bg-img/home-2/s-3.png" alt=""></a>
              </div></div><div class="owl-item active" style="width: 205px; margin-right: 100px;"><div class="single-slider">
                <a href="#"><img src="/img/bg-img/home-2/s-4.png" alt=""></a>
              </div></div><div class="owl-item" style="width: 205px; margin-right: 100px;"><div class="single-slider">
                <a href="#"><img src="/img/bg-img/home-2/s-3.png" alt=""></a>
              </div></div><div class="owl-item cloned" style="width: 205px; margin-right: 100px;"><div class="single-slider">
                <a href="#"><img src="/img/bg-img/home-2/s-1.png" alt=""></a>
              </div></div><div class="owl-item cloned" style="width: 205px; margin-right: 100px;"><div class="single-slider">
                <a href="#"><img src="/img/bg-img/home-2/s-2.png" alt=""></a>
              </div></div><div class="owl-item cloned" style="width: 205px; margin-right: 100px;"><div class="single-slider">
                <a href="#"><img src="/img/bg-img/home-2/s-3.png" alt=""></a>
              </div></div><div class="owl-item cloned" style="width: 205px; margin-right: 100px;"><div class="single-slider">
                <a href="#"><img src="/img/bg-img/home-2/s-4.png" alt=""></a>
              </div></div></div></div><div class="owl-nav disabled"><button type="button" role="presentation" class="owl-prev"><span aria-label="Previous">‹</span></button><button type="button" role="presentation" class="owl-next"><span aria-label="Next">›</span></button></div><div class="owl-dots disabled"></div></div>
          </div>
        </div>
      </div>
    </div>
    <div class="counter-area-home-2">
      <div class="counter-shape wow fadeInLeft" data-wow-delay="900ms" style="visibility: visible; animation-delay: 900ms; animation-name: fadeInLeft;">
        <img src="/img/bg-img/counter-shape.png" alt="">
      </div>
      <div class="container">
        <div class="row justify-content-center">
          <!-- Single card -->
          <div class="col-sm-6 col-lg-4">
            <div class="single-counter-2-card d-flex align-items-center wow fadeInDown" data-wow-delay="500ms" style="visibility: visible; animation-delay: 500ms; animation-name: fadeInDown;">
              <!-- icon -->
              <div class="counter-2-icon">
                <span class="icon-ruler-combined-solid-1"></span>
              </div>
              <!-- text -->
              <div class="counter-2-text">
                <h2><span class="counter">23</span><span>k</span></h2>
                <p>Online Courses</p>
              </div>
            </div>
          </div>

          <!-- Single card -->
          <div class="col-sm-6 col-lg-4">
            <div class="single-counter-2-card d-flex align-items-center wow fadeInDown" data-wow-delay="700ms" style="visibility: visible; animation-delay: 700ms; animation-name: fadeInDown;">
              <!-- icon -->
              <div class="counter-2-icon">
                <span class="icon-book-solid-11"></span>
              </div>
              <!-- text -->
              <div class="counter-2-text">
                <h2><span class="counter">5</span><span>k+</span></h2>
                <p>Online Courses</p>
              </div>
            </div>
          </div>

          <!-- Single card -->
          <div class="col-sm-6 col-lg-4">
            <div class="single-counter-2-card d-flex align-items-center wow fadeInDown" data-wow-delay="900ms" style="visibility: visible; animation-delay: 900ms; animation-name: fadeInDown;">
              <!-- icon -->
              <div class="counter-2-icon">
                <span class="icon-ruler-combined-solid-1"></span>
              </div>
              <!-- text -->
              <div class="counter-2-text">
                <h2><span class="counter">58</span><span>k+</span></h2>
                <p>Online Student</p>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="portfolio-area">
      <!-- Shape -->
      <div class="gallery-curbe-shape">
        <img src="/img/bg-img/hero-2-shape.png" alt="">
      </div>
      <div class="g-shape-2 wow fadeInDown animated" data-wow-delay="700ms" style="visibility: visible; animation-delay: 700ms; animation-name: spin;">
        <img src="/img/bg-img/home-2/shape-20.png" alt="">
      </div>

      <div class="g-shape-3">
        <img src="/img/bg-img/home-2/shape-19.png" alt="">
      </div>

      <div class="g-shape-1 wow fadeInDown" data-wow-delay="700ms" style="visibility: visible; animation-delay: 700ms; animation-name: fadeInDown;">
        <img src="/img/bg-img/home-2/shape-18.png" alt="">
      </div>
      <div class="container">
        <div class="row justify-content-center">
          <!-- title -->
          <div class="col-lg-7">
            <div class="section-title-area text-center wow fadeInDown" data-wow-delay="500ms" style="visibility: visible; animation-delay: 500ms; animation-name: fadeInDown;">
              <h6>Portfolio</h6>
              <h2 class="mb-0">Our Colourful Journey</h2>
            </div>
          </div>
        </div>

        <div class="row g-4 g-lg-5 gallery-area" style="position: relative; height: 419.008px;">
          <!-- Card -->
          <div class="col-12 col-sm-6 col-lg-3" style="position: absolute; left: 0%; top: 0px;">
            <div class="portfolio-card border--pri-1">
              <div class="portfolio-image  wow fadeInUp" data-wow-duration="1000ms" data-wow-delay="200ms" style="visibility: visible; animation-duration: 1000ms; animation-delay: 200ms; animation-name: fadeInUp;">
                <img src="/img/bg-img/home-2/p-1.png" alt="">

                <!-- Overlay Content -->
                <div class="overlay-content d-flex align-items-center justify-content-center">
                  <div class="text-center venobox-area">
                    <a class="venobox mb-3 vbox-item" data-maxwidth="800px" data-gall="portfolio" href="img/bg-img/home-2/p-1.png">
                      <span class="icon-Arrow-1"></span>
                    </a>
                  </div>
                </div>
              </div>
            </div>

            <div class="portfolio-card border--pri-1 mt-20">
              <div class="portfolio-image wow fadeInUp" data-wow-duration="1000ms" data-wow-delay="200ms" style="visibility: visible; animation-duration: 1000ms; animation-delay: 200ms; animation-name: fadeInUp;">
                <img src="/img/bg-img/home-2/p-2.png" alt="">

                <!-- Overlay Content -->
                <div class="overlay-content d-flex align-items-center justify-content-center">
                  <div class="text-center">
                    <a class="venobox mb-3 vbox-item" data-maxwidth="800px" data-gall="portfolio" href="img/bg-img/home-2/p-2.png">
                      <span class="icon-Arrow-1"></span>
                    </a>
                  </div>
                </div>
              </div>
            </div>
          </div>

          <!-- Card -->
          <div class="col-12 col-sm-6 col-lg-3" style="position: absolute; left: 25%; top: 0px;">
            <div class="portfolio-card border--dark-1">
              <div class="portfolio-image wow fadeInUp" data-wow-duration="1000ms" data-wow-delay="200ms" style="visibility: visible; animation-duration: 1000ms; animation-delay: 200ms; animation-name: fadeInUp;">
                <img src="/img/bg-img/home-2/p-3.png" alt="">

                <!-- Overlay Content -->
                <div class="overlay-content d-flex align-items-center justify-content-center">
                  <div class="text-center">
                    <a class="venobox mb-3 vbox-item" data-maxwidth="800px" data-gall="portfolio" href="img/bg-img/home-2/p-3.png">
                      <span class="icon-Arrow-1"></span>
                    </a>
                  </div>
                </div>
              </div>
            </div>

            <div class="portfolio-card border--navy-1 mt-20">
              <div class="portfolio-image wow fadeInUp" data-wow-duration="1000ms" data-wow-delay="200ms" style="visibility: visible; animation-duration: 1000ms; animation-delay: 200ms; animation-name: fadeInUp;">
                <img src="/img/bg-img/home-2/p-4.png" alt="">

                <!-- Overlay Content -->
                <div class="overlay-content d-flex align-items-center justify-content-center">
                  <div class="text-center">
                    <a class="venobox mb-3 vbox-item" data-maxwidth="800px" data-gall="portfolio" href="img/bg-img/home-2/p-4.png">
                      <span class="icon-Arrow-1"></span>
                    </a>
                  </div>
                </div>
              </div>
            </div>
          </div>

          <!-- Card -->
          <div class="col-12 col-sm-6 col-lg-3" style="position: absolute; left: 50%; top: 0px;">
            <div class="portfolio-card border--pri-2">
              <div class="portfolio-image wow fadeInUp" data-wow-duration="1000ms" data-wow-delay="200ms" style="visibility: visible; animation-duration: 1000ms; animation-delay: 200ms; animation-name: fadeInUp;">
                <img src="/img/bg-img/home-2/p-5.png" alt="">

                <!-- Overlay Content -->
                <div class="overlay-content d-flex align-items-center justify-content-center">
                  <div class="text-center">
                    <a class="venobox mb-3 vbox-item" data-maxwidth="800px" data-gall="portfolio" href="img/bg-img/home-2/p-5.png">
                      <span class="icon-Arrow-1"></span>
                    </a>
                  </div>
                </div>
              </div>
            </div>
          </div>

          <!-- Card -->
          <div class="col-12 col-sm-6 col-lg-3" style="position: absolute; left: 75%; top: 0px;">
            <div class="portfolio-card border--pri-1">
              <div class="portfolio-image wow fadeInUp" data-wow-duration="1000ms" data-wow-delay="200ms" style="visibility: visible; animation-duration: 1000ms; animation-delay: 200ms; animation-name: fadeInUp;">
                <img src="/img/bg-img/home-2/p-6.png" alt="">

                <!-- Overlay Content -->
                <div class="overlay-content d-flex align-items-center justify-content-center">
                  <div class="text-center">
                    <a class="venobox mb-3 vbox-item" data-maxwidth="800px" data-gall="portfolio" href="img/bg-img/home-2/p-6.png">
                      <span class="icon-Arrow-1"></span>
                    </a>
                  </div>
                </div>
              </div>
            </div>

            <div class="portfolio-card border--navy-1 mt-20">
              <div class="portfolio-image wow fadeInUp" data-wow-duration="1000ms" data-wow-delay="200ms" style="visibility: visible; animation-duration: 1000ms; animation-delay: 200ms; animation-name: fadeInUp;">
                <img src="/img/bg-img/home-2/p-7.png" alt="">

                <!-- Overlay Content -->
                <div class="overlay-content d-flex align-items-center justify-content-center">
                  <div class="text-center">
                    <a class="venobox mb-3 vbox-item" data-maxwidth="800px" data-gall="portfolio" href="img/bg-img/home-2/p-7.png">
                      <span class="icon-Arrow-1"></span>
                    </a>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="upcoming-event-area relative">
      <!-- all shape img -->
      <div class="up-shape-1">
        <img src="/img/bg-img/home-2/shpe-11.png" alt="">
      </div>
      <div class="up-shape-2 wow fadeInUp" data-wow-delay="700ms" style="visibility: visible; animation-delay: 700ms; animation-name: fadeInUp;">
        <img src="/img/bg-img/home-2/shpe-12.png" alt="">
      </div>

      <div class="up-shape-3 wow fadeInUp" data-wow-delay="1500ms" style="visibility: visible; animation-delay: 1500ms; animation-name: fadeInUp;">
        <img src="/img/bg-img/home-2/shpe-13.png" alt="">
      </div>

      <div class="container">
        <div class="row justify-content-center">
          <!-- title -->
          <div class="col-lg-6">
            <div class="section-title-area text-center wow fadeInDown" data-wow-delay="500ms" style="visibility: visible; animation-delay: 500ms; animation-name: fadeInDown;">
              <h6>Events</h6>
              <h2 class="mb-0">Upcoming Event</h2>
            </div>
          </div>
        </div>

        <div class="row align-items-end">
          <div class="col-md-5">
            <!-- Image -->
            <div class="event-image wow fadeInUp" data-wow-delay="700ms" style="visibility: visible; animation-delay: 700ms; animation-name: fadeInUp;">
              <img src="/img/bg-img/event.png" alt="">
            </div>
          </div>

          <div class="col-md-1"></div>

          <div class="col-md-6">
            <div class="event-content-text">
              <!-- Single Card -->
              <div class="single-event-card d-flex align-items-center wow fadeInRight" data-wow-delay="900ms" style="visibility: visible; animation-delay: 900ms; animation-name: fadeInRight;">
                <div class="event-price">
                  <h5>$30</h5>
                </div>
                <div class="event-card-content">
                  <p>Age: 2-4 Years Time: 9.00 - 11.00</p>
                  <h4>Magic Princess Birthday Party </h4>
                </div>
              </div>

              <!-- Single Card -->
              <div class="single-event-card d-flex align-items-center wow fadeInRight" data-wow-delay="1100ms" style="visibility: visible; animation-delay: 1100ms; animation-name: fadeInRight;">
                <div class="event-price">
                  <h5>$100</h5>
                </div>
                <div class="event-card-content">
                  <p>Age: 2-4 Years Time: 9.00 - 11.00</p>
                  <h4>Sports Day Carnival</h4>
                </div>
              </div>

              <!-- Single Card -->
              <div class="single-event-card d-flex align-items-center wow fadeInRight" data-wow-delay="1300ms" style="visibility: visible; animation-delay: 1300ms; animation-name: fadeInRight;">
                <div class="event-price">
                  <h5>$10</h5>
                </div>
                <div class="event-card-content">
                  <p>Age: 2-4 Years Time: 9.00 - 11.00</p>
                  <h4>Cultural Diversity Week </h4>
                </div>
              </div>

              <!-- Single Card -->
              <div class="single-event-card d-flex align-items-center wow fadeInRight" data-wow-delay="1500ms" style="visibility: hidden; animation-delay: 1500ms; animation-name: none;">
                <div class="event-price">
                  <h5>$30</h5>
                </div>
                <div class="event-card-content">
                  <p>Magic Paper Plates Art Gallery</p>
                  <h4>Magic Princess Birthday Party </h4>
                </div>
              </div>

            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="client-area-home-2 relative">
      <!-- Curbe shape -->
      <div class="client-curbe-shape">
        <img src="/img/bg-img/home-2/shape-14.png" alt="">
      </div>
      <div class="client-2-shape-1">
        <img src="/img/bg-img/home-4/shape-6.png" alt="">
      </div>
      <div class="container">
        <div class="row justify-content-center">
          <!-- title -->
          <div class="col-md-8 col-lg-7">
            <div class="section-title-area text-center  wow fadeInDown" data-wow-delay="500ms" style="visibility: visible; animation-delay: 500ms; animation-name: fadeInDown;">
              <h6>Our Client Feedback</h6>
              <h2 class="mb-0">What they’re saying about our courses</h2>
            </div>
          </div>
        </div>

        <div class="row">
          <!-- Image -->
          <div class="col-md-4">
            <div class="client-image-home-2 relative  wow fadeInLeft" data-wow-delay="700ms" style="visibility: visible; animation-delay: 700ms; animation-name: fadeInLeft;">
              <img class="relative" src="/img/bg-img/home-2/client.jpeg.jpg" alt="">
              <div class="c-2-border-1"></div>
              <div class="c-2-border-2"></div>
              <div class="c-2-border-3"></div>
              <div class="c-2-border-4"></div>
              <div class="c-2-border-5"></div>
            </div>
          </div>

          <div class="col-lg-8">
            <div class="swiper client-active-2 wow fadeInRight swiper-initialized swiper-horizontal swiper-pointer-events swiper-backface-hidden" data-wow-delay="900ms" style="visibility: visible; animation-delay: 900ms; animation-name: fadeInRight;">
              <!-- If we need navigation buttons -->
              <div class="testimonials-3-navigation-wrapper position-relative">
                <div class="common-slider-navigation">
                  <button class="client-active-1-button-prev" tabindex="0" aria-label="Previous slide" aria-controls="swiper-wrapper-bab3cf46d0795ae5"><span class="icon-arrow-right"></span></button>
                  <button class="client-active-1-button-next" tabindex="0" aria-label="Next slide" aria-controls="swiper-wrapper-bab3cf46d0795ae5"><span class="icon-right"></span></button>
                </div>
              </div>
              <div class="swiper-wrapper" id="swiper-wrapper-bab3cf46d0795ae5" aria-live="off" style="transition-duration: 3000ms; transform: translate3d(-1076px, 0px, 0px);"><div class="swiper-slide swiper-slide-duplicate swiper-slide-next swiper-slide-duplicate-prev" data-swiper-slide-index="0" role="group" aria-label="1 / 1" style="width: 468px; margin-right: 70px;">
                <div class="client-slider-home-2">

                  <!-- Single Slider -->
                  <div class="clinet-single-slider">
                    <div class="footer-icon-home-2">
                      <span class="icon-search-soli1d-1"></span>
                    </div>
                    <div class="client-info-meta-home-2">
                      <div class="client-img-rating-2">
                        <div class="clinet-rating">
                          <ul>
                            <li><span class="icon-star1"></span></li>
                            <li><span class="icon-star1"></span></li>
                            <li><span class="icon-star1"></span></li>
                            <li><span class="icon-star1"></span></li>
                            <li><span class="icon-star1"></span></li>
                          </ul>
                        </div>
                      </div>

                      <p>"Edumastery has been an amazing experience for our daughter,
                        Lily. The
                        inclusive and enriching atmosphere has not only helped her
                        academic
                        growth but has also fostered her social and emotional
                        development. We
                        are grateful for the caring and dedicated staff."</p>
                      <!-- client info -->
                      <div class="client-footer d-flex align-items-end justify-content-between">
                        <div class="d-flex align-items-center">
                          <div class="user-icon">
                            <span class="icon-Frame"></span>
                          </div>
                          <div class="client-info">
                            <h4>Bessie Cooper</h4>
                            <p>Nintendo</p>
                          </div>
                        </div>
                      </div>

                    </div>
                  </div>
                </div>
              </div>
                <!-- single block -->
                <div class="swiper-slide swiper-slide-duplicate-active swiper-slide-prev swiper-slide-duplicate-next" data-swiper-slide-index="0" role="group" aria-label="1 / 1" style="width: 468px; margin-right: 70px;">
                  <div class="client-slider-home-2">

                    <!-- Single Slider -->
                    <div class="clinet-single-slider">
                      <div class="footer-icon-home-2">
                        <span class="icon-search-soli1d-1"></span>
                      </div>
                      <div class="client-info-meta-home-2">
                        <div class="client-img-rating-2">
                          <div class="clinet-rating">
                            <ul>
                              <li><span class="icon-star1"></span></li>
                              <li><span class="icon-star1"></span></li>
                              <li><span class="icon-star1"></span></li>
                              <li><span class="icon-star1"></span></li>
                              <li><span class="icon-star1"></span></li>
                            </ul>
                          </div>
                        </div>

                        <p>"Edumastery has been an amazing experience for our daughter,
                          Lily. The
                          inclusive and enriching atmosphere has not only helped her
                          academic
                          growth but has also fostered her social and emotional
                          development. We
                          are grateful for the caring and dedicated staff."</p>
                        <!-- client info -->
                        <div class="client-footer d-flex align-items-end justify-content-between">
                          <div class="d-flex align-items-center">
                            <div class="user-icon">
                              <span class="icon-Frame"></span>
                            </div>
                            <div class="client-info">
                              <h4>Bessie Cooper</h4>
                              <p>Nintendo</p>
                            </div>
                          </div>
                        </div>

                      </div>
                    </div>
                  </div>
                </div>
                <div class="swiper-slide swiper-slide-duplicate swiper-slide-active swiper-slide-duplicate-prev" data-swiper-slide-index="0" role="group" aria-label="1 / 1" style="width: 468px; margin-right: 70px;">
                  <div class="client-slider-home-2">

                    <!-- Single Slider -->
                    <div class="clinet-single-slider">
                      <div class="footer-icon-home-2">
                        <span class="icon-search-soli1d-1"></span>
                      </div>
                      <div class="client-info-meta-home-2">
                        <div class="client-img-rating-2">
                          <div class="clinet-rating">
                            <ul>
                              <li><span class="icon-star1"></span></li>
                              <li><span class="icon-star1"></span></li>
                              <li><span class="icon-star1"></span></li>
                              <li><span class="icon-star1"></span></li>
                              <li><span class="icon-star1"></span></li>
                            </ul>
                          </div>
                        </div>

                        <p>"Edumastery has been an amazing experience for our daughter,
                          Lily. The
                          inclusive and enriching atmosphere has not only helped her
                          academic
                          growth but has also fostered her social and emotional
                          development. We
                          are grateful for the caring and dedicated staff."</p>
                        <!-- client info -->
                        <div class="client-footer d-flex align-items-end justify-content-between">
                          <div class="d-flex align-items-center">
                            <div class="user-icon">
                              <span class="icon-Frame"></span>
                            </div>
                            <div class="client-info">
                              <h4>Bessie Cooper</h4>
                              <p>Nintendo</p>
                            </div>
                          </div>
                        </div>

                      </div>
                    </div>
                  </div>
                </div></div>
              <span class="swiper-notification" aria-live="assertive" aria-atomic="true"></span></div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<style scoped>

</style>