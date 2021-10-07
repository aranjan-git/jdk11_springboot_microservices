# jdk11_springboot_microservices
Learning Springboot-microservices

1. Prerequisite to run these microservices

Install java 11
Install Maven 3.xx

2. Steps to test fallback in hystrix dashboard

a. Go to Service Registry URL : http://localhost:8761/
b. Click on HYSTRIX-DASHBOARD and change the URL to http://localhost:9295/hystrix
c. Click on API-GATEWAY and change the URL  to http://localhost:9191/actuator/hystrix.stream
d. Copy URL http://localhost:9191/actuator/hystrix.stream and paste it in page (http://localhost:9295/hystrix) Hystrix Dashboard search text box and then click on Monitor stream button.
e. Test the departmentService and userService using Postman and you can see the changes in Hystrix Dashbaord

3. Steps to check distributed log on Zipkin Server

Download Zipkin Server [link](https://zipkin.io/pages/quickstart.html)

Go to Zipkin server file zipkin-server-2.23.4-exec.jar 
run command : java -jar zipkin-server-2.23.4-exec.jar

It will show the zipkin default IP address on which it's running

Take the [URL address](http://127.0.0.1:9411/zipkin/) from command prompt and paste in browser URL.
Now you can test the departmentService and userService from Postman and see the changes.

You can click on Run Query. It will show last 15  min query result.
Or You can click on "+" symbol and it will show serviceName in dropdown.
select serviceName and provide departmentService or userService and query it.
you can see the result.
