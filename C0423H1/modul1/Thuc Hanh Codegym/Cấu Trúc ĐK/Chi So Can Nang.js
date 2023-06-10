function kiemtra() {
    let weigh = document.getElementById("nang").value;
    let height = document.getElementById("cao").value;
    let bmi = eval(weigh / (height * height)); console.log (bmi)
    let result = "";
    if (bmi < 18)
        result= ("Underweight");
    else if (bmi < 25.0)
        result= ("Normal");
    else if (bmi < 30.0)
        result= ("Overweight");
    else
        result= ("Obese");
    document.getElementById("result").innerHTML = "Chỉ số BMI là: " + bmi;
}