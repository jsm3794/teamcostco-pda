package main.java.com.teamcostco;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.util.Enumeration;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

import main.java.com.teamcostco.component.Navigator;
import main.java.com.teamcostco.controller.HomeController;
import main.java.com.teamcostco.controller.HomeTestController;
import main.java.com.teamcostco.controller.LoginTestController;
import main.java.com.teamcostco.controller.SignTestController;



public class MainForm {
	
	public static Navigator nav = new Navigator("home");
	
	public static final int FORM_WIDTH = 480;
	public static final int FORM_HEIGHT = 640;

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("팀코스트코");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());

		// Navigator 설정
		setupNavigator();

		frame.add(nav, BorderLayout.CENTER);
		frame.pack(); // 내부 컨텐츠 크기에 맞게 폼 사이즈 조정
		frame.setMinimumSize(frame.getSize());
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	private static void setupUISettings() {
		Enumeration<Object> keys = UIManager.getDefaults().keys();
		while (keys.hasMoreElements()) {
			Object key = keys.nextElement();
			Object value = UIManager.get(key);
			if (value instanceof FontUIResource) {
				UIManager.put(key, new FontUIResource(new Font("맑은 고딕", Font.PLAIN, 18)));
			}
		}
	}
	
	
	private static void setupNavigator() {
		
		// Navigator 컨트롤러 매핑
		nav.mappingTarget("home", HomeTestController.class);
		nav.mappingTarget("login", LoginTestController.class);
		nav.mappingTarget("sign", SignTestController.class);


		

		// Navigator 디자인
		nav.setPreferredSize(new Dimension(FORM_WIDTH, FORM_HEIGHT));
		//nav.setBorder(new LineBorder(Color.RED, 1));

		// 기본 페이지로 이동
		nav.push("home", false);
	}
	
	
}
