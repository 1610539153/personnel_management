<%--
  Created by IntelliJ IDEA.
  User: guang
  Date: 2018/3/9
  Time: 9:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
    <link href="../css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <script src="../js/bootstrap.min.js"></script>
    <script>
        function checkCustomer(value) {
            var checkcustomer = document.getElementById("checkcustomer");
            var reg = /^[0-9a-z_-]{3,12}$/;

            if (value == "") {
                checkcustomer.innerHTML = "用户不能为空";
                return false;
            }
            if (reg.test(value)) {
                checkcustomer.innerHTML = "";

                return true;
            } else {
                checkcustomer.innerHTML = "请输入3--12个字母或数字";
                return false;
            }
        }
        function checkPassword(value) {
            var checkpassword = document.getElementById("checkpassword");
            var reg = /^[a-z0-9_-]{6,18}$/;
            if (value =="") {
                checkpassword.innerHTML = "密码不能为空";
                return false;
            }
            if (reg.test(value)) {
                checkpassword.innerHTML = "";

                return true;
            } else {
                checkpassword.innerHTML = "请输入6-18个数字或字母";
                return false;
            }
        }

        function checkEmail(value) {
            var checkemail = document.getElementById("checkemail");
            var reg = /^([a-z0-9_\.-]+)@([\da-z\.-]+)\.([a-z\.]{2,6})$/
            /^[a-z\d]+(\.[a-z\d]+)*@([\da-z](-[\da-z])?)+(\.{1,2}[a-z]+)+$/;
            if (value == "") {
                checkemail.innerHTML = "邮箱不能为空";
                return false;
            }
            if (reg.test(value)) {
                checkemail.innerHTML = "";
                return true;
            } else {
                checkemail.innerHTML = "请输正确的邮箱";
                return false;
            }
        }
        function checkPhone(value) {
            var checkemail = document.getElementById("checkphone");
            var reg = /^1[35678]{1}[0-9]{9}$/;
            if (value == "") {
                checkphone.innerHTML = "电话不能为空";
                return false;
            }
            if (reg.test(value)) {
                checkphone.innerHTML = "";
                return true;
            } else {
                checkphone.innerHTML = "请输入真确的电话号码";
                return false;
            }
        }

    </script>
</head>
<body>
<form action="/customer/reg.do"  >
    用户名<input type="text"  name="customerName" onblur="checkCustomer(this.value)" required><br/>
    <span id="checkcustomer"></span><br/>
    密码<input type="password" name="customerPassword" onblur="checkPassword(this.value)" required ><br/>
    <span id="checkpassword"></span><br/>
    邮箱<input type="email" name="customerEmail" onblur="checkEmail(this.value)" ><br/>
    <span id="checkemail"></span><br/>
    手机号<input type="text" name="customerPhone" onblur="checkPhone(this.value)"><br/>
    <span id="checkphone"></span><br/>
    <input type="submit" value="注册" >
</form>

</body>
</html>
