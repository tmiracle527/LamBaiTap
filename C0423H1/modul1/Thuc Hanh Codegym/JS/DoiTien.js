function hienthi(){
    let money=parseInt(document.getElementById("money").value);
    let from= (document.getElementById("from").value);
    let to=(document.getElementById("to").value);
    let tigia= 23000;
    let result;
    if (to=="VND1") {
        if (from == "VND") {
            result = money;
            document.getElementById('result').value = result;
            console.log(result);
            document.getElementById("giatri").innerText = "Dong";
        }
        if (from == "USD") {
            result = tigia * money;
            document.getElementById('result').value = result;
            console.log('result');
            document.getElementById("giatri").innerText = "Dong";
        }
    }
    else {
        if (from=="VND"){
            result=money/tigia;
            document.getElementById('result').value= result;
            console.log(result);
            document.getElementById("giatri").innerText="Dollar";
        }
        if (from=="USD"){
            result=money;
            document.getElementById('result').value=result;
            console.log(result);
            document.getElementById("giatri").innerText="Dollar";
        }
    }
}