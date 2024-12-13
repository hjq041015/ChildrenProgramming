<script setup>
import HeaderBreadcrumb from "@/components/HeaderBreadcrumb.vue";
import {useCurrentTime} from "@/utils/data.js";

const { days, hours, seconds, minutes } = useCurrentTime('2022-09-10')

const teachers = [
  {
    id: 1,
    name: '白马讲师',
    role: 'Java开发讲师'
  }, {
    id: 2,
    name: '绿马讲师',
    role: 'Python开发讲师'
  }, {
    id: 3,
    name: '蓝马讲师',
    role: 'C#开发讲师'
  }, {
    id: 1,
    name: '牛马讲师',
    role: 'Golang开发讲师'
  }
]
</script>

<template>
  <div>
    <header-breadcrumb :path="['关于我们', '公司介绍']"/>
    <div class="about-us-area single-page">
      <div class="container">
        <div class="row justify-content-between">
          <!-- title & image -->
          <div class="col-lg-7">
            <div class="about-single-image">
              <div class="about-single-1-img">
                <img src="/img/bg-img/inner/about-1.png" alt="">
              </div>
              <div class="about-single-2-img">
                <img class="about-info-img-1" src="/img/bg-img/inner/about-2.png" alt="">
                <img class="about-info-img-2" src="/img/bg-img/inner/about-3.png" alt="">
              </div>
            </div>
          </div>
          <!-- About Text -->
          <div class="col-lg-5">
            <div class="about-us-title-img">
              <div class="wow fadeInRight" data-wow-delay="500ms" style="visibility: visible; animation-delay: 500ms; animation-name: fadeInRight;">
                <h6 class="about-sub-title"><span class="icon-open-book-1"></span> 公司介绍</h6>
                <h3>让每一个儿童都适应时代的发展</h3>
              </div>
            </div>
            <div class="about-desc-info-area">
              <h6 class="mb-4">Engage learners in active learning activities such as discussions,
                problem-solving
                exercises, or hands-on demonstrations. Encourage participation and interaction to
                foster
                deeper learning and retention of details.</h6>
              <!-- Content Card Area -->
              <div class="about-content-card-area">
                <div class="row">
                  <!-- Single Card -->
                  <div class="col-md-6">
                    <div class="about-single-card wow fadeInRight" data-wow-delay="1000ms" style="visibility: visible; animation-delay: 1000ms; animation-name: fadeInRight;">
                      <div class="about-card-icon">
                        <span class="icon-maps-and-flags3 text--primary"></span>
                      </div>
                      <h4>Flexible shedule</h4>
                      <p>Offer ongoing support and feedback to learners throughout.</p>
                      <span class="about-line-shape"></span>
                    </div>
                  </div>

                  <!-- Single Card -->
                  <div class="col-md-6">
                    <div class="about-single-card wow fadeInRight" data-wow-delay="1200ms" style="visibility: visible; animation-delay: 1200ms; animation-name: fadeInRight;">
                      <div class="about-card-icon">
                        <span class="icon-maps-and-flags2 text--second"></span>
                      </div>
                      <h4>Pocket friendly</h4>
                      <p>Offer ongoing support and feedback to learners throughout.</p>
                      <span class="about-line-shape"></span>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="text-slider-section single-page">
      <div class="text-slider-box">
        <div class="slide-box">
          <h2><span>学习 .</span></h2>
        </div>
        <div class="slide-box">
          <h2>柏码 .</h2>
        </div>
        <div class="slide-box">
          <h2>少儿 .</h2>
        </div>
        <div class="slide-box">
          <h2>编程</h2>
        </div>

        <div class="slide-box">
          <h2>快乐 .</h2>
        </div>
        <div class="slide-box">
          <h2>锻炼</h2>
        </div>
      </div>
    </div>
    <div class="counter-up-area single-page" style="background-image: url(/img/bg-img/popular.png);">
      <div class="container">
        <div class="row justify-content-center">
          <!-- title -->
          <div class="col-md-8 col-lg-7">
            <div class="section-title-area text-center wow fadeInRight" data-wow-delay="500ms" style="visibility: visible; animation-delay: 500ms; animation-name: fadeInRight;">
              <h6>公司成立了多久？</h6>
              <h2 class="mb-0">我们创立了柏码少儿编程已经</h2>
            </div>
          </div>
        </div>
        <div class="row">
          <!-- single card -->
          <div class="col-sm-6 col-lg-3">
            <div class="single-counter-card wow fadeInRight" data-wow-delay="500ms" style="visibility: visible; animation-delay: 500ms; animation-name: fadeInRight;">
              <div class="counter-info text-center bg--primary">
                <h2>{{ days }}</h2>
                <p>天</p>
              </div>
            </div>
          </div>

          <!-- single card -->
          <div class="col-sm-6 col-lg-3">
            <div class="single-counter-card wow fadeInRight" data-wow-delay="700ms" style="visibility: visible; animation-delay: 700ms; animation-name: fadeInRight;">
              <div class="counter-info text-center bg--second">
                <h2>{{ hours }}</h2>
                <p>小时</p>
              </div>
            </div>
          </div>

          <!-- single card -->
          <div class="col-sm-6 col-lg-3">
            <div class="single-counter-card wow fadeInRight" data-wow-delay="900ms" style="visibility: visible; animation-delay: 900ms; animation-name: fadeInRight;">
              <div class="counter-info text-center bg--dark">
                <h2>{{ minutes }}</h2>
                <p>分钟</p>
              </div>
            </div>
          </div>
          <!-- single card -->
          <div class="col-sm-6 col-lg-3">
            <div class="single-counter-card wow fadeInRight" data-wow-delay="1100ms" style="visibility: visible; animation-delay: 1100ms; animation-name: fadeInRight;">
              <div class="counter-info text-center bg--navy">
                <h2>{{ seconds }}</h2>
                <p>秒</p>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="how-we-work-area">
      <div class="container">
        <div class="row">
          <div class="col-lg-6">
            <div class="how-we-content">
              <div class="wow fadeInRight" data-wow-delay="500ms" style="visibility: visible; animation-delay: 500ms; animation-name: fadeInRight;">
                <h6 class="how-sub-title"><span class="icon-open-book-1"></span> 我们的教学流程</h6>
                <h2>努力让每一个学生都感受到编程开发带来的乐趣</h2>
                <p>Provide additional resources such as readings, articles, videos, or online
                  tutorials for learners who want to explore the details further. Offer
                  recommendations for reputable sources to ensure quality information. Assess
                  learners' understanding of the details through quizzes, assessments, or
                  assignments. </p>
              </div>
            </div>
          </div>

          <div class="col-lg-6">
            <div class="how-it-work-content-3 single-page relative">
              <div class="side-video-img relative">
                <img src="/img/bg-img/home-3/how.png" alt="">
              </div>

              <div class="play-btn course">
                <div class="video_player_btn">
                  <a href="https://www.youtube.com/watch?v=eEzD-Y97ges" class="popup-video"><span class="icon-Polygon-1"></span></a>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="team-area single-page">
      <div class="container">
        <div class="row justify-content-center">
          <div class="col-md-8 col-lg-7">
            <div class="section-title-area text-center wow fadeInRight" data-wow-delay="500ms" style="visibility: visible; animation-delay: 500ms; animation-name: fadeInRight;">
              <h6>经验丰富的教学团队</h6>
              <h2 class="mb-0">我们的杰出教师列表广受学生好评</h2>
            </div>
          </div>
        </div>
        <div class="row">
          <!-- Single member -->
          <div class="col-sm-6 col-lg-3" v-for="teacher in teachers">
            <div class="team-block">
              <div class="single-team-card relative wow fadeInUp" data-wow-delay="500ms" style="visibility: visible; animation-delay: 500ms; animation-name: fadeInUp;">
                <!-- Border shape -->
                <div class="border-s-1"></div>
                <div class="border-s-2"></div>
                <div class="border-s-3"></div>
                <div class="border-s-4"></div>
                <div class="border-s-5"></div>
                <!-- img -->
                <div class="team-img relative">
                  <img class="relative" :src="`/img/bg-img/t-${teacher.id}.jpg`" alt="">

                  <!-- content text -->
                  <div class="member-info text-center">
                    <h3>{{ teacher.name }}</h3>
                    <p>{{ teacher.role }}</p>
                  </div>

                  <div class="contact-social-icon">
                    <div class="share-icon-area">
                      <div class="share-icon"> <span class="icon-share-alt-solid-1 share--icon"></span>
                        <div class="conatct-icon-">
                          <ul>
                            <li><a href="#"><span class="icon-facebook-f"></span></a>
                            </li>
                            <li><a href="#"><span class="icon-linkedin-in"></span></a>
                            </li>
                            <li><a href="#"><span class="icon-twitter"></span></a></li>
                          </ul>
                        </div>
                      </div>

                    </div>

                  </div>
                </div>
              </div>
            </div>

          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<style scoped>

</style>