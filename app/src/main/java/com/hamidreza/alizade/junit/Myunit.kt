package com.hamidreza.alizade.junit

import android.util.Log

class Myunit{

    companion object{
        fun sum(number:List<Int>):Int{

            var sumation:Int=0
            for (num:Int in number){
                sumation+=num
            }

            return  sumation;
        }
        fun sumFloat(number:List<Int>):Float{

            var sumation:Float=0.0f
            for (num:Int in number){
                sumation+=num.toFloat()
            }

            return  sumation/number.size;
        }

        fun numExists(number:List<Int>,numberToSearchFor : Int):Boolean{

            var sumation:Float=0.0f
            for (num:Int in number){
                if (num==numberToSearchFor){
                    return true
                }
                sumation+=num.toFloat()
            }

            return  false;
        }
        fun search(number:List<Int>,numberToSearchFor : Int):Int{


            for (num:Int in number){
                if (numberToSearchFor==number.get(num)){
                    return 5
                }

            }

            return  1;
        }
    }
}