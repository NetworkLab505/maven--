$(function () {
    $.getJSON('./json/head1.json',function(response,status,xhr) {
        document.getElementById("number1").innerText= response.firstnumber;
        document.getElementById("number2").innerText= response.firstnumber;
        document.getElementById("number3").innerText= response.secondnumber;
        document.getElementById("number4").innerText= response.secondnumber;
        document.getElementById("number5").innerText= response.threenumber;
        document.getElementById("number6").innerText= response.threenumber;
        document.getElementById("number7").innerText= response.fournumber;
        document.getElementById("number8").innerText= response.fournumber;
    })
});