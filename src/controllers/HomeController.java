package controllers;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Product;
import services.DatabaseServices;
import services.ProductService;

public class HomeController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException{
		Connection conn =DatabaseServices.getConnection();
		ProductService ptsv = new ProductService();
		List<Product> ft = ptsv.getProductFeatured1(conn);
		request.setAttribute("ft", ft);
		List<Product> os = ptsv.getProductOnSale(conn);
		request.setAttribute("os", os);
		List<Product> br = ptsv.getProductBestRate(conn);
		request.setAttribute("br", br);
		List<Product> dw = ptsv.getProductDealOfWeek(conn);
		request.setAttribute("dw", dw);
		List<Product> hn = ptsv.getProductHotNew(conn);
		request.setAttribute("hn", hn);
		List<Product> av = ptsv.getProductHotNew(conn);
		request.setAttribute("av", av);
		List<Product> lc = ptsv.getProductHotNew(conn);
		request.setAttribute("lc", lc);
		Product hnc = ptsv.getProductHotNewCover(conn);
		request.setAttribute("hnc", hnc);
		List<Product> hbs = ptsv.getProductHotBestSellers(conn);
		request.setAttribute("hbs", hbs);
		List<Product> aav = ptsv.getProductAuAndVi(conn);
		request.setAttribute("aav", aav);
		List<Product> lac = ptsv.getProductLapACom(conn);
		request.setAttribute("lac", lac);
		List<Product> t = ptsv.getProductTrends(conn);
		request.setAttribute("t", t);
		List<Product> v = ptsv.getProductViewed(conn);
		request.setAttribute("v", v);
		RequestDispatcher  dispatcher = request.getRequestDispatcher("WEB-INF/views/home/home.jsp");
		dispatcher.forward(request, response);
	}
}

