$(function () {
    $.ajax({
        type: "GET",
        url: "json/index.json",
        dataType: "json",
        success: function (response, status, xhr) {
            document.getElementById('login').innerHTML = response[17].name;
            document.getElementById('register').innerHTML = response[18].name;
        }
    });
});