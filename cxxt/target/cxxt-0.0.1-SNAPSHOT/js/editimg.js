//表格头部不动
window.onload = function(){
    var tableCont = document.querySelector('#table-cont')
    /**
     * scroll handle
     * @param {event} e &#45;&#45; scroll event
     */
    function scrollHandle (e){
        console.log(this)
        var scrollTop = this.scrollTop;
        this.querySelector('thead').style.transform = 'translateY(' + scrollTop + 'px)';
    }
}
//删除
function del(n){
    var index = n.parentNode.parentNode.rowIndex;
    console.log(index);
    table.deleteRow(index);
}
//搜索
function onSearch(obj){//js函数开始
    setTimeout(function(){//因为是即时查询，需要用setTimeout进行延迟，让值写入到input内，再读取
        var tableId = document.getElementById('table');//获取table的id标识
        var rowsLength = tableId.rows.length;//表格总共有多少行
        var key = obj.value;//获取输入框的值
        var searchCol = 1;//要搜索的哪一列，这里是第二列，从0开始数起
        for(var i=1;i<rowsLength;i++){//按表的行数进行循环，本例第一行是标题，所以i=1，从第二行开始筛选（从0数起）
            var searchText = tableId.rows[i].cells[searchCol].innerHTML;//取得table行，列的值
            if(searchText.match(key)){//用match函数进行筛选，如果input的值，即变量 key的值为空，返回的是ture，
                tableId.rows[i].style.display='';//显示行操作，
            }else{
                tableId.rows[i].style.display='none';//隐藏行操作
            }
        }
    },200);//200为延时时间
}
//修改功能
function modify(obj){
    var oId = document.getElementById('Id');
    var oLearning_direction = document.getElementById('Learning_direction');
    var oGrade = document.getElementById('Grade');
    var oImage_Name = document.getElementById('Image_Name');
    var oImage = document.getElementById('Image');
    var oPicture_Introduction = document.getElementById('Picture_Introduction');
    var oTr = obj.parentNode.parentNode;
    var aTd = oTr.getElementsByTagName('td');
    rowIndex = obj.parentNode.parentNode.rowIndex;
    oId.value = aTd[0].innerHTML;
    oLearning_direction.value = aTd[1].innerHTML;
    oGrade.value = aTd[2].innerHTML;
    oImage_Name.value = aTd[3].innerHTML;
    oImage.value = aTd[4].innerHTML;
    oPicture_Introduction.value = aTd[5].innerHTML;
    console.log(aTd[6].innerHTML);
    //alert(i);
}
//更新功能
function update(){
    var oId = document.getElementById('Id');
    var oLearning_direction = document.getElementById('Learning_direction');
    var oGrade = document.getElementById('Grade');
    var oImage_Name = document.getElementById('Image_Name');
    var oImage = document.getElementById('Image');
    var oPicture_Introduction = document.getElementById('Picture_Introduction');
    var otable = document.getElementById('table');
    //alert(rowIndex);
    //var aTd = rowIndex.cells;
    console.log(otable.rows[rowIndex].cells)
    otable.rows[rowIndex].cells[0].innerHTML = oId.value;
    otable.rows[rowIndex].cells[1].innerHTML = oLearning_direction.value;
    otable.rows[rowIndex].cells[2].innerHTML = oGrade.value;
    otable.rows[rowIndex].cells[3].innerHTML = oImage_Name.value;
    otable.rows[rowIndex].cells[4].innerHTML = oImage.value;
    otable.rows[rowIndex].cells[5].innerHTML = oPicture_Introduction.value;
}