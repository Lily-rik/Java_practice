package jp.learningdesign.javastudy;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BmiCalc
 */
public class BmiCalc extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public BmiCalc() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;charset=UTF-8"); // レスポンスのheaderを送信するメソッド
		PrintWriter out = response.getWriter(); // データを書き出す
		out.println("<html><body>");
		out.println("<h1>こんにちは、サーブレットの世界へようこそ！");
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response .getWriter();
		String height_in ,weight_in;
		double height, weight, bmi;
		height_in = request.getParameter("height1");
		weight_in = request.getParameter("weight1");
		height = Double.parseDouble(height_in); // 実数に変換するメソッド
		weight = Double.parseDouble(weight_in);
		height /= 100;
		bmi = weight /(height * height);
		
		out.println("<html><body>");
		out.println("<p>あなたのBMI、体格指数は、" + bmi + "です。");
		out.println("</body></html>");
	}

}
