def qsort(xs : Array[Int]) {
    def swap(i : Int,j : Int){
        val t = xs(i);xs(i) = xs(j);xs(i) = t
    }

    def sort(l : Int, r : Int){
        val pivot = (l + r) / 2
        var i = l;var j = r
        while(i < j){
            while(xs(i) <= xs(pivot)) i += 1;
            while(xs(j) >= xs(pivot)) j -= 1;
            if(i < j){
                swap(i,j)
                i += 1
                j -= 1
            }
        }
        if(i > l) sort(l,i)
        if(j < r) sort(j,r)
    }

    sort(0,xs.length - 1)
}

def qsort2(xs : Array[Int]) : Array[Int] = {
    if(xs.length <= 1) xs
    else{
        val pivot = xs(xs.length / 2)
        Array.concat(
            qsort2(xs.filter(_ < pivot)),
            xs.filter(_ == pivot),
            qsort2(xs.filter(_ > pivot))
        )
    }
}

object Hi{
    def main() {
        var array = 1 to 3
        println(array)
    }
}
