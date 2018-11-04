function CheckUser(){

    var nValue=document.getElementById("userName").value;
    var pValue=document.getElementById("userPassword").value;
    var mValue=document.getElementById("qqEmail").value;
    var tValue=document.getElementById("telephone").value;
    var idValue=document.getElementById("userID").value;
    if(idValue=="")
    {
        document.getElementById("IDspan").innerHTML="<font color='red'>请填写ID!</font>";
        return false;
    }
    else
    {
        document.getElementById("IDspan").innerHTML="";
    }
    if(nValue=="")
    {
        document.getElementById("namespan").innerHTML="<font color='red'>用户名不能为空！</font>";
        return false;
    }
    else
    {
        document.getElementById("namespan").innerHTML="";
    }

    if(pValue=="")
    {
        document.getElementById("pspan").innerHTML="<font color='red'>密码不能为空！</font>";
        return false;
    }
    else
    {
        document.getElementById("pspan").innerHTML="";
    }
    if(mValue=="")
    {
        document.getElementById('mspan').innerHTML="<font color='red'>请输入邮箱号！</font>";
        return false;
    }
    else if(!/^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(.[a-zA-Z0-9_-])+/.test(mValue))
    {
        document.getElementById('mspan').innerHTML="<font color='red'>邮箱格式不正确！</font>";
        return false;
    }

    else{
        document.getElementById('mspan').innerHTML="";
    }
    if(tValue=="")
    {
        document.getElementById('telespan').innerHTML="<font color='red'>请输入手机号！</font>";
        return false;
    }
    else if(!(/^1[3|4|5|8][0-9]\d{4,8}$/.test(tValue))){
        document.getElementById('telespan').innerHTML="<font color='red'>手机号格式不正确！</font>";
        return false;
    }
    else {
        document.getElementById('telespan').innerHTML="";
    }
    close();
}
function close() {
     $('#adduser').window('close');
     submituser();
}

function submituser(){
    var Id = document.getElementById("userID").value;
    var User_Nickname=document.getElementById("userName").value;
    var User_Password=document.getElementById("userPassword").value;
    var email= document.getElementById("qqEmail").value;
    var Phone_number=document.getElementById("telephone").value;
    row = document.getElementById("table").insertRow();
    if(row!=null){
        cell=row.insertCell();
        cell.innerHTML=Id;
        cell = row.insertCell();
        cell.innerHTML=User_Nickname;
        cell = row.insertCell();
        cell.innerHTML=User_Password;
        cell=row.insertCell();
        cell.innerHTML=email;
        cell = row.insertCell();
        cell.innerHTML=Phone_number;
        cell = row.insertCell();
        cell.innerHTML='<button class="btn btn-link" onclick="del(this)">删除</button>';
        cell = row.insertCell();
        cell.innerHTML='<button class="btn btn-link" onclick="$(\'#w\').window(\'open\'); modify(this) ">编辑</button>';

    }
    return false;
}