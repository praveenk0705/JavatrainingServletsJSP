package comshubham.jsf2;

import java.util.Map;

import javax.annotation.*;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.*;
import javax.servlet.*;
import javax.servlet.http.*;

@ManagedBean(name = "ecdemoBean")
@SessionScoped
public class ECDemoBean {
	String str = "Shubham Learning Center";

	public String getStr() {
		System.out.println("getStr()");
		return str;
	}

	public void setStr(String str) {
		System.out.println("SsetStr()");
		this.str = str;
	}

	public ECDemoBean() {
		System.out.println("\n======ECDemoBean.ECDemoBean()=======");
		FacesContext fc = FacesContext.getCurrentInstance();
		ExternalContext ec = fc.getExternalContext();
		ServletContext sc = (ServletContext) ec.getContext();
		sc.setAttribute("Country1", "INDIA");
		sc.setAttribute("Country2", "INDIA");

		HttpSession session = (HttpSession) ec.getSession(true);
		session.setAttribute("STATE1", "KA");
		session.setAttribute("STATE2", "KA");

		HttpServletRequest req = (HttpServletRequest) ec.getRequest();
		req.setAttribute("CITY1", "Bangalore");
		req.setAttribute("CITY2", "Bangalore");

		System.out.println("======Data is stored successfully========");
	}

	@PostConstruct
	public void myInit() {
		System.out.println("\n******myInit()******");
	}

	@PreDestroy
	public void myDestroy() {
		System.out.println("\n******myDestroy()*******");
	}

	public String show() {
		System.out.println("\n******show() Started*******");
		FacesContext fc = FacesContext.getCurrentInstance();
		ExternalContext ec = fc.getExternalContext();

		System.out.println("\n*******Context Attribute******");
		ServletContext sc = (ServletContext) ec.getContext();
		System.out.println(sc.getAttribute("Country1"));
		System.out.println(sc.getAttribute("Country2"));
		System.out.println("--------------");

		System.out.println("\n*******Sessiont Attribute******");
		HttpSession session = (HttpSession) ec.getSession(true);
		System.out.println(session.getAttribute("STATE1"));
		System.out.println(session.getAttribute("STATE2"));
		System.out.println("--------------");

		System.out.println("\n*******Request Attribute******");
		HttpServletRequest req = (HttpServletRequest) ec.getRequest();
		System.out.println(req.getAttribute("CITY1"));
		System.out.println(req.getAttribute("CITY2"));
		System.out.println("---------------");

		System.out.println("\n*******Context Map******");
		Map<String, Object> ctxmap = ec.getApplicationMap();
		ctxmap.put("SID", "999");
		displayMap2(ctxmap);
		System.out.println("----------------");

		System.out.println("\n*******Session Map******");
		Map<String, Object> sesmap = ec.getSessionMap();
		sesmap.put("SID", "888");
		displayMap2(sesmap);
		System.out.println("----------------");

		System.out.println("\n*******Request Map******");
		Map<String, Object> reqmap = ec.getRequestMap();
		reqmap.put("SID", "777");
		displayMap2(reqmap);
		System.out.println("----------------");

		System.out.println("\n*******InitParameterMap******");
		Map<String, String> ctxParams = ec.getInitParameterMap();
		displayMap1(ctxParams);
		System.out.println("----------------");

		System.out.println("\n*******RequestParameterMap******");
		Map<String, String> reqParams = ec.getRequestParameterMap();
		displayMap1(reqParams);
		System.out.println("----------------");

		System.out.println("\n*******RequestHeaderMap******");
		Map<String, String> reqHeaders = ec.getRequestHeaderMap();
		displayMap1(reqHeaders);
		System.out.println("----------------");

		System.out.println("\n*******RequestCookieMap******");
		Map<String, Object> reqCookies = ec.getRequestCookieMap();
		displayMap2(reqCookies);
		System.out.println("----------------");
		System.out.println("=======show() Completed======");

		return "show";
	}

	private void displayMap1(Map<String, String> map) {
		for (Map.Entry<String, String> me : map.entrySet()) {
			System.out.println(me.getKey() + "---" + me.getValue());
		}
	}

	private void displayMap2(Map<String, Object> map) {
		for (Map.Entry<String, Object> me : map.entrySet()) {
			System.out.println(me.getKey() + "---" + me.getValue());
		}
	}
}
