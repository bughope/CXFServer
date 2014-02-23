package org.masque.demo.cxf.server.client;

import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

public class ClientTest {

	public static void main(String[] args) throws Exception {
		JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
		org.apache.cxf.endpoint.Client client = dcf
				.createClient("http://localhost:8080/CXFServer/serivces/Users?wsdl");
		// sayHello 为接口中定义的方法名称 张三为传递的参数 返回一个Object数组
		Object[] objects = client.invoke("getUserList", "张三");
		// 输出调用结果
		
		System.out.println(objects[0].toString());
	}
}
