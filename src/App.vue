<script setup>
import {useHeaderSticky} from "@/utils/header.js";
import {onMounted} from "vue";
onMounted(useHeaderSticky)
</script>

<template>
  <div>
    <div class="top-header">
      <div class="container h-100">
        <div class="row h-100 align-items-center">
          <div class="col-md-6 col-lg-7">
            <div class="contact-info d-flex align-items-center">
              <a href="mailto:info@doorsoft"><span class="icon-mail"></span> <span class="text-white contact-desc">alma.lawson@example.com</span></a>
              <a href=""><span class="icon-phone-alt-solid-11"></span> <span class="text-white contact-desc">123 - 456 - 7890</span></a>
            </div>
          </div>
          <div class="col-md-6 col-lg-5">
            <div class="d-flex align-items-center top-social-conatct">
              <!-- Dropdown -->
              <div class="top-social-icon">
                <ul class="header-icon">
                  <li><span class="text-white">加入我们:</span></li>
                  <li><a href="#"><span class="icon-facebook-f"></span></a></li>
                  <li><a href="#"><span class="icon-linkedin-in"></span></a></li>
                  <li><a href="#"><span class="icon-twitter"></span></a></li>
                  <li><a href="#"><span class="icon-instagram"></span></a></li>
                </ul>
              </div>
              <div class="contact-info">
                <a class="login-btn" href="#"><span class="icon-user-plus-solid-1"></span> 注册</a>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <header class="header-area home-2 bg--navy" id="header">
      <nav class="navbar navbar-expand-lg">
        <div class="container menu-area-">
          <!-- Navbar Brand -->
          <div class="mobile-menu">
            <a class="navbar-brand" href="index.html">
              <img src="@/assets/img/core-img/logo-2.png" alt="Brand">
            </a>
          </div>

          <!-- Navbar Toggler -->
          <button class="navbar-toggler" id="navbarToggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarContent" aria-controls="navbarContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="icon-menu"></span>
          </button>

          <!-- Navbar -->
          <div class="collapse navbar-collapse" id="navbarContent">
            <ul class="navbar-nav navbar-nav-scroll mb-3 mb-lg-0" id="SupportHiveNav">
              <li class="dropdown-list">
                <a href="#">Home</a>
                <div class="dropdown-toggler"><i class="icon-down-arrow-1"></i></div><ul>
                <li><a href="index.html">Education</a></li>
                <li><a href="index-kid-education.html">KidEducation</a></li>
                <li><a href="index-marketplaxe.html">Marketplace</a></li>
                <li><a href="index-university.html">University Classic</a></li>
              </ul>
              </li>
              <li class="dropdown-list">
                <a href="#">Course</a>
                <div class="dropdown-toggler"><i class="icon-down-arrow-1"></i></div><ul>
                <li><a href="course-list.html">Course list</a></li>
                <li><a href="all-course.html">all Course</a></li>
                <li><a href="course-details.html">Course Details</a></li>
              </ul>
              </li>

              <li class="dropdown-list">
                <a href="#">Pages</a>
                <div class="dropdown-toggler"><i class="icon-down-arrow-1"></i></div><ul>
                <li><a href="about.html">About</a></li>
                <li><a href="gallery.html">Gallery</a></li>
                <li><a href="faq.html">Faq</a></li>
                <li><a href="pricing.html">Price</a></li>
                <li><a href="team.html">Team</a></li>
                <li><a href="contact.html">Contact</a></li>
                <li><a href="login.html">Login</a></li>
              </ul>
              </li>
              <li class="dropdown-list">
                <a href="#">Event</a>
                <div class="dropdown-toggler"><i class="icon-down-arrow-1"></i></div><ul>
                <li><a href="event.html">Event list</a></li>
                <li><a href="event-sidebar.html">Event Sidebar</a></li>
                <li><a href="event-details.html">Event Details</a></li>
              </ul>
              </li>
              <li class="dropdown-list">
                <a href="#">Shop</a>
                <div class="dropdown-toggler"><i class="icon-down-arrow-1"></i></div><ul>
                <li><a href="shop.html">Shop</a></li>
                <li><a href="shop-details.html">Shop Details</a></li>
                <li><a href="cart.html">Cart</a></li>
                <li><a href="checkout.html">Checkout</a></li>
              </ul>
              </li>

              <li class="dropdown-list">
                <a href="#">Blog</a>
                <div class="dropdown-toggler"><i class="icon-down-arrow-1"></i></div><ul>
                <li><a href="blog.html">Blog</a></li>
                <li><a href="blog-details.html">Blog Details</a></li>
              </ul>
              </li>
            </ul>

            <div class="cart-search-area ml-auto d-flex align-items-center">
              <div class="search-home-2">
                <div class="header-action">
                  <div class="search-toggle-open header-search">
                    <div class="search-icon">
                      <span class="icon-icon_search2"></span>
                    </div>
                  </div>
                </div>
              </div>
              <div class="cart-btn-area relative">
                <a href="#" class="relative"><span class="icon-icon_cart_alt"></span></a>
                <div class="cart-badge bg--dark">0</div>
              </div>
            </div>
          </div>
        </div>
      </nav>
    </header>
    <div class="smooth-body">
      <div style="height: 500px"></div>
      <div class="smooth-content">
        <footer class="footer-wrap bg--dark">
          <!-- Shape -->
          <div class="f-shape-1 wow fadeInUp" data-wow-delay="900ms" style="visibility: visible; animation-delay: 900ms; animation-name: fadeInUp;">
            <img src="@/assets/img/bg-img/f-shap-1.png" alt="">
          </div>
          <!-- Shape -->
          <div class="f-shape-2 wow fadeInRight" data-wow-delay="700ms" style="visibility: visible; animation-delay: 700ms; animation-name: fadeInRight;">
            <img src="@/assets/img/bg-img/f-shap-2.png" alt="">
          </div>
          <!-- Shape -->
          <div class="f-shape-3 wow fadeInRight" data-wow-delay="500ms" style="visibility: visible; animation-delay: 500ms; animation-name: fadeInRight;">
            <img src="@/assets/img/bg-img/f-shape-3.png" alt="">
          </div>
          <div class="footer-content">
            <div class="container">
              <div class="row justify-content-between">
                <div class="col-12 col-sm-6 col-lg-3">
                  <div class="me-4">
                    <a class="mb-4 d-block footer-logo" href="#">
                      <img src="@/assets/img/core-img/logo-2.png" alt="">
                    </a>
                    <p class="footer-desc">超过 18,000+ 小朋友在我们这学习Java</p>

                    <div class="footer-contact-info wow fadeInLeft" data-wow-delay="700ms" style="visibility: visible; animation-delay: 700ms; animation-name: fadeInLeft;">
                      <ul>
                        <li><a href="#"><span class="icon-facebook-f"></span></a></li>
                        <li><a href="#"><span class="icon-instagram"></span></a></li>
                        <li><a href="#"><span class="icon-linkedin-in"></span></a></li>
                        <li><a href="#"><span class="icon-instagram"></span></a></li>
                      </ul>
                    </div>
                  </div>
                </div>

                <div class="col-12 col-sm-6 col-lg-2">
                  <div class="quick-links-nav">
                    <h5 class="mb-3 text-white">探索</h5>
                    <span class="footer-shape-1"></span>
                    <span class="footer-shape-2"></span>
                    <ul>
                      <li><a href="#">GMAT Coaching</a></li>
                      <li><a href="#">GRE Coaching</a></li>
                      <li><a href="#">IELTS Coaching</a></li>
                      <li><a href="#">TOEFL Coaching</a></li>
                      <li><a href="#">SAT Coaching</a></li>
                    </ul>
                  </div>
                </div>

                <div class="col-12 col-sm-6 col-lg-2">
                  <div class="quick-links-nav">
                    <h5 class="mb-3 text-white">友情链接</h5>
                    <ul>
                      <li><a href="#">SAT Coaching</a></li>
                      <li><a href="#">IELTS Coaching</a></li>
                      <li><a href="#">GRE Coaching</a></li>
                      <li><a href="#">GMAT Coaching</a></li>
                      <li><a href="#">TOEFL Coaching</a></li>
                    </ul>
                  </div>
                </div>

                <div class="col-12 col-sm-6 col-lg-3">
                  <div class="quick-contact-nav">
                    <h5 class="mb-3 text-white">联系我们</h5>
                    <span class="footer-shape-1"></span>
                    <span class="footer-shape-2"></span>
                    <ul>
                      <li>
                        <p><span class="icon-incoming-call"></span> + 1 (246) 333-0088</p>
                      </li>
                      <li>
                        <p><span class="icon-email"></span> alma.lawson@example.com</p>
                      </li>
                      <li>
                        <p><span class="icon-map"></span> 4140 上海市普陀区 新村路435号</p>
                      </li>
                    </ul>
                  </div>
                </div>
              </div>
            </div>
          </div>

          <div class="copy-right-area">
            <div class="container">
              <div class="row">
                <div class="col-12">
                  <div class="copy-right-text text-center wow fadeInDown" data-wow-delay="900ms" style="visibility: visible; animation-delay: 900ms; animation-name: fadeInDown;">
                    <p class="mb-0"> © Copyright 2024 by <a href="https://www.bootstrapmb.com">bootstrapMB</a></p>
                  </div>
                </div>

              </div>
            </div>
          </div>
        </footer>
      </div>
    </div>
  </div>
</template>

<style scoped>

</style>
