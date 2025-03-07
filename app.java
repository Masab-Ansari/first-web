// var num = 2
// num + 10
// document.write(num)

// var num = 2
// num = num + 10
// document.write(num)

// var num1 = 2
// var num2 = 3
// // var eq = --num1 + ++num2 - num2++ - num1-- + num1
// var eq = num1+10 + num2++ - num2++;
// document.write(eq)

//if statement

// > greaterthan
// < lessthan
// <= lessthan or equal to
// >= greaterthan or equal to
// == equals to (sirf value) check krega
// === strichly equal to
// != not equal to
// !== strickly not equal to

// if(4 != 3){
//     document.write(ok)
// }

// var secretnum = 5
// var usernum = +prompt("Enter any number")

// if(secretnum == usernum)

var username = prompt("Enter your name")
var maths = +prompt("Enter maths marks")
var eng = +prompt("Enter english marks")
var urdu = +prompt("Enter urdu marks")
var bio = +prompt("Enter Bio marks")
var cs = +prompt("Enter Computer marks")
var marksObtained = maths + eng + urdu + bio + cs
var perc = (marksObtained / 500)*100

if(marksObtained >= 400){
    document.write(grad A+)
}
else if(perc >= 90){
    document.write(grad A)
}
else if(perc >= 60){
    document.write(grad C)
}
else if(perc >= 40){
    document.write(grad D)
}

document.write(perc)
// if(perc >= 80){
//     document.write( grad A)
// }