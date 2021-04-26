<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<div class="deals_featured">
	<div class="container">
		<div class="row">
			<div
				class="col d-flex flex-lg-row flex-column align-items-center justify-content-start">

				<!-- Deals -->

				<div class="deals">
					<div class="deals_title">Deals of the Week</div>
					<div class="deals_slider_container">

						<!-- Deals Slider -->
						<div class="owl-carousel owl-theme deals_slider">
							<c:forEach var="dw" items="${dw}">
								<!-- Deals Item -->
								<div class="owl-item deals_item">
									<div class="deals_image">
										<img src="resources/images/deals.png" alt="">
									</div>
									<div class="deals_content">
										<div
											class="deals_info_line d-flex flex-row justify-content-start">
											<div class="deals_item_category">
												<a href="#">Headphones</a>
											</div>
											<div class="deals_item_price_a ml-auto">
												<fmt:formatNumber value="${dw.getPrice()}" type="number"
													maxIntegerDigits="8" />
											</div>
										</div>
										<div
											class="deals_info_line d-flex flex-row justify-content-start">
											<div class="deals_item_name"></div>
											<div class="deals_item_price ml-auto">
												<fmt:formatNumber value="${dw.getPriceNet()}" type="number"
													maxIntegerDigits="8" />
											</div>
										</div>
										<div class="available">
											<div
												class="available_line d-flex flex-row justify-content-start">
												<div class="available_title">
													Available: <span>${dw.getAvailable()}</span>
												</div>
												<div class="sold_title ml-auto">
													Sold:<span>${dw.getSold()}</span>
												</div>
											</div>
											<div class="available_bar">
												<span style="width: 17%"></span>
											</div>
										</div>
										<div
											class="deals_timer d-flex flex-row align-items-center justify-content-start">
											<div class="deals_timer_title_container">
												<div class="deals_timer_title">Hurry Up</div>
												<div class="deals_timer_subtitle">Offer ends in:</div>
											</div>
											<div class="deals_timer_content ml-auto">
												<div class="deals_timer_box clearfix" data-target-time="">
													<div class="deals_timer_unit">
														<div id="deals_timer1_hr" class="deals_timer_hr"></div>
														<span>hours</span>
													</div>
													<div class="deals_timer_unit">
														<div id="deals_timer1_min" class="deals_timer_min"></div>
														<span>mins</span>
													</div>
													<div class="deals_timer_unit">
														<div id="deals_timer1_sec" class="deals_timer_sec"></div>
														<span>secs</span>
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
							</c:forEach>
							<!-- Deals Item -->

							<div class="owl-item deals_item">
								<div class="deals_image">
									<img src="resources/images/deals.png" alt="">
								</div>
								<div class="deals_content">
									<div
										class="deals_info_line d-flex flex-row justify-content-start">
										<div class="deals_item_category">
											<a href="#">Headphones</a>
										</div>
										<div class="deals_item_price_a ml-auto"></div>
									</div>
									<div
										class="deals_info_line d-flex flex-row justify-content-start">
										<div class="deals_item_name">Beoplay H7</div>
										<div class="deals_item_price ml-auto"></div>
									</div>
									<div class="available">
										<div
											class="available_line d-flex flex-row justify-content-start">
											<div class="available_title">Available:</div>
											<div class="sold_title ml-auto">Already sold:</div>
										</div>
										<div class="available_bar">
											<span style="width: 17%"></span>
										</div>
									</div>
									<div
										class="deals_timer d-flex flex-row align-items-center justify-content-start">
										<div class="deals_timer_title_container">
											<div class="deals_timer_title">Hurry Up</div>
											<div class="deals_timer_subtitle">Offer ends in:</div>
										</div>
										<div class="deals_timer_content ml-auto">
											<div class="deals_timer_box clearfix" data-target-time="">
												<div class="deals_timer_unit">
													<div id="deals_timer2_hr" class="deals_timer_hr"></div>
													<span>hours</span>
												</div>
												<div class="deals_timer_unit">
													<div id="deals_timer2_min" class="deals_timer_min"></div>
													<span>mins</span>
												</div>
												<div class="deals_timer_unit">
													<div id="deals_timer2_sec" class="deals_timer_sec"></div>
													<span>secs</span>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>

							<!-- Deals Item -->
							<div class="owl-item deals_item">
								<div class="deals_image">
									<img src="resources/images/deals.png" alt="">
								</div>
								<div class="deals_content">
									<div
										class="deals_info_line d-flex flex-row justify-content-start">
										<div class="deals_item_category">
											<a href="#">Headphones</a>
										</div>
										<div class="deals_item_price_a ml-auto">$300</div>
									</div>
									<div
										class="deals_info_line d-flex flex-row justify-content-start">
										<div class="deals_item_name">Beoplay H7</div>
										<div class="deals_item_price ml-auto">$225</div>
									</div>
									<div class="available">
										<div
											class="available_line d-flex flex-row justify-content-start">
											<div class="available_title">
												Available: <span>6</span>
											</div>
											<div class="sold_title ml-auto">
												Already sold: <span>28</span>
											</div>
										</div>
										<div class="available_bar">
											<span style="width: 17%"></span>
										</div>
									</div>
									<div
										class="deals_timer d-flex flex-row align-items-center justify-content-start">
										<div class="deals_timer_title_container">
											<div class="deals_timer_title">Hurry Up</div>
											<div class="deals_timer_subtitle">Offer ends in:</div>
										</div>
										<div class="deals_timer_content ml-auto">
											<div class="deals_timer_box clearfix" data-target-time="">
												<div class="deals_timer_unit">
													<div id="deals_timer3_hr" class="deals_timer_hr"></div>
													<span>hours</span>
												</div>
												<div class="deals_timer_unit">
													<div id="deals_timer3_min" class="deals_timer_min"></div>
													<span>mins</span>
												</div>
												<div class="deals_timer_unit">
													<div id="deals_timer3_sec" class="deals_timer_sec"></div>
													<span>secs</span>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>

						</div>

					</div>

					<div class="deals_slider_nav_container">
						<div class="deals_slider_prev deals_slider_nav">
							<i class="fas fa-chevron-left ml-auto"></i>
						</div>
						<div class="deals_slider_next deals_slider_nav">
							<i class="fas fa-chevron-right ml-auto"></i>
						</div>
					</div>
				</div>

				<!-- Featured -->
				<div class="featured">
					<div class="tabbed_container">
						<div class="tabs">
							<ul class="clearfix">
								<li class="active">Featured</li>
								<li>On Sale</li>
								<li>Best Rated</li>
							</ul>
							<div class="tabs_line">
								<span></span>
							</div>
						</div>

						<!-- Product Panel -->
						<div class="product_panel panel active">
							<div class="featured_slider slider">

								<!-- Slider Item -->
								<c:forEach var="ft" items="${ft}">
									<div class="featured_slider_item">
										<div class="border_active"></div>
										<div
											class="product_item discount d-flex flex-column align-items-center justify-content-center text-center">
											<div
												class="product_image d-flex flex-column align-items-center justify-content-center">
												<img src="resources/${ft.getImage()}" alt="">
											</div>
											<div class="product_content">
												<div class="product_price discount">
													<fmt:formatNumber value="${ft.getPriceNet()}" type="number"
														maxIntegerDigits="8" />
													<span><fmt:formatNumber value="${ft.getPrice()}"
															type="number" maxIntegerDigits="8" /></span>
												</div>
												<div class="product_name">
													<div>
														<a href="product?id=${ft.getId()}">${ft.getTitle()}</a>
													</div>
												</div>
												<div class="product_extras">
													<div class="product_color">
														<input type="radio" checked name="product_color"
															style="background: #b19c83"> <input type="radio"
															name="product_color" style="background: #000000">
														<input type="radio" name="product_color"
															style="background: #999999">
													</div>
													<button class="product_cart_button">Add to Cart</button>
												</div>
											</div>
											<div class="product_fav">
												<i class="fas fa-heart"></i>
											</div>
											<ul class="product_marks">
												<li class="product_mark product_discount">-25%</li>
												<li class="product_mark product_new">new</li>
											</ul>
										</div>
									</div>
								</c:forEach>

							</div>
							<div class="featured_slider_dots_cover"></div>
						</div>

						<!-- Product Panel -->

						<div class="product_panel panel">
							<div class="featured_slider slider">

								<!-- Slider Item -->
								<c:forEach var="os" items="${os}">
									<div class="featured_slider_item">
										<div class="border_active"></div>
										<div
											class="product_item discount d-flex flex-column align-items-center justify-content-center text-center">
											<div
												class="product_image d-flex flex-column align-items-center justify-content-center">
												<img src="resources/${os.getImage()}" alt="">
											</div>
											<div class="product_content">
												<div class="product_price discount">
													<fmt:formatNumber value="${os.getPriceNet()}" type="number"
														maxIntegerDigits="8" />
													<span><fmt:formatNumber value="${os.getPrice()}"
															type="number" maxIntegerDigits="8" /></span>
												</div>
												<div class="product_name">
													<div>
														<a href="product?id=${os.getId()}">${os.getTitle()}</a>
													</div>
												</div>
												<div class="product_extras">
													<div class="product_color">
														<input type="radio" checked name="product_color"
															style="background: #b19c83"> <input type="radio"
															name="product_color" style="background: #000000">
														<input type="radio" name="product_color"
															style="background: #999999">
													</div>
													<button class="product_cart_button">Add to Cart</button>
												</div>
											</div>
											<div class="product_fav">
												<i class="fas fa-heart"></i>
											</div>
											<ul class="product_marks">
												<li class="product_mark product_discount">-25%</li>
												<li class="product_mark product_new">new</li>
											</ul>
										</div>
									</div>
								</c:forEach>


							</div>
							<div class="featured_slider_dots_cover"></div>
						</div>

						<!-- Product Panel -->

						<div class="product_panel panel">
							<div class="featured_slider slider">

								<!-- Slider Item -->
								<c:forEach var="br" items="${br}">
									<div class="featured_slider_item">
										<div class="border_active"></div>
										<div
											class="product_item discount d-flex flex-column align-items-center justify-content-center text-center">
											<div
												class="product_image d-flex flex-column align-items-center justify-content-center">
												<img src="resources/${br.getImage()}" alt="">
											</div>
											<div class="product_content">
												<div class="product_price discount">
													<fmt:formatNumber value="${br.getPriceNet()}" type="number"
														maxIntegerDigits="8" />
													<span><fmt:formatNumber value="${br.getPrice()}"
															type="number" maxIntegerDigits="8" /></span>
												</div>
												<div class="product_name">
													<div>
														<a href="product?id=${br.getId()}">${br.getTitle()}</a>
													</div>
												</div>
												<div class="product_extras">
													<div class="product_color">
														<input type="radio" checked name="product_color"
															style="background: #b19c83"> <input type="radio"
															name="product_color" style="background: #000000">
														<input type="radio" name="product_color"
															style="background: #999999">
													</div>
													<button class="product_cart_button">Add to Cart</button>
												</div>
											</div>
											<div class="product_fav">
												<i class="fas fa-heart"></i>
											</div>
											<ul class="product_marks">
												<li class="product_mark product_discount">-25%</li>
												<li class="product_mark product_new">new</li>
											</ul>
										</div>
									</div>
								</c:forEach>


							</div>
							<div class="featured_slider_dots_cover"></div>
						</div>

					</div>
				</div>

			</div>
		</div>
	</div>
</div>
