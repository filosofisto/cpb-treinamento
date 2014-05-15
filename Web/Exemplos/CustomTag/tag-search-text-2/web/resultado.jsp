<%@page contentType="text/html" %>
<%@taglib uri="/WEB-INF/tlds/mytags.tld" prefix="x"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
    <head>
        <title>.: ${initParam.titulo} :.</title>
    </head>

    <body>
        <h3>${initParam.titulo}</h3>
            <h3>Pesquisar texto: ${param.texto}</h3>
            <x:searchText text="${param.texto}">		
                <i>
                    "Vossa alma é muitas vezes um campo de batalha onde se 
                    digladiam vossa razão e julgamento com vossa paixão e vosso 
                    apetite.<br/>
                    Pudesse eu ser o apaziguador de vossa alma, e transformar a 
                    discórdia e rivalidade de vossos elementos em unidade e 
                    harmonia.<br/>
                    Mas como o farei a não ser que vós mesmos vos torneis 
                    pacificadores, ou antes, amantes de todos vossos elementos?<br/>
                    Vossa razão e vossa paixão são o leme e as velas de vossa 
                    alma navegante.<br/>
                    Se vossas velas e vosso leme se quebrarem, só podereis 
                    balancar a deriva ou ficardes parados no meio do mar."
                </i>
            </x:searchText>	
    </body>
</html>