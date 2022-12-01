(ns impractical-sort.bogosort)

(defn ascending? [[x y & _ :as coll]]
  (if (nil? y) true
      (if (> x y) false
          (recur (rest coll)))))

(defn bogosort [coll]
  (if (ascending? coll) coll
      (recur (shuffle coll))))

(time (bogosort [9 6 0 7 1 5 2 3 8 4]))
;=> "Elapsed time: 6937.974985 msecs"
;=> [0 1 2 3 4 5 6 7 8 9]
