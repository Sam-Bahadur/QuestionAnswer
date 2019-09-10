<html>
<head>
    <style><%@include file="/WEB-INF/views/css.css"%></style>
    <div class="login-page">
        <div class="form">
            <%--<form class="register-form">--%>
                <%--<input type="text" placeholder="name"/>--%>
                <%--<input type="password" placeholder="password"/>--%>
                <%--<input type="text" placeholder="email address"/>--%>
                <%--<button>create</button>--%>
                <%--<p class="message">Already registered? <a href="#">Sign In</a></p>--%>
            <%--</form>--%>
            <form class="login-form" action="save" method="post">
                <input name="user_name" type="text" placeholder="username"/>
                <input name="password" type="password" placeholder="password"/>
                <button type="submit">Log In</button>


                <%--<p class="message">Not registered? <a href="#">Create an account</a></p>--%>
            </form>
        </div>
    </div>
</head>
</html>