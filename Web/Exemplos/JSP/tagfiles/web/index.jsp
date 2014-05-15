<%@taglib prefix="view" tagdir="/WEB-INF/tags"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="<%=request.getContextPath()%>/css/styles.css" rel="stylesheet" type="text/css">
        <title>.: TagFiles :.</title>
    </head>
    <body>
        <table>
            <tr>
                <td colspan="2">
                    <view:header/>
                </td>
            </tr> 
            <tr>
                <td colspan="2">
                   <h1>TagFiles</h1>
                </td>
            </tr>
            <tr>
                <td valign="top">
                    <view:menu/>
                </td>
                <td valign="top">
                    <p>
                        Tagfiles são estruturas bastante interessantes.<br>
                        Foi incluído nas especificação JSP2.0
                    </p>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <view:footer/>
                </td>
            </tr>
        </table>
    </body>
</html>