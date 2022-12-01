(ns impractical-sort.sleepsort)

(defn sleepsort [coll]
  (letfn [(f [n]
            (Thread/sleep n)
            (print n))]
    (pmap f coll)))

(time (sleepsort [9 6 0 7 1 5 2 3 8 4]))

;; "Elapsed time: 8.782958 msecs"
;; (nil nil nil nil nil nil nil nil nil nil)0123546798 <- FIXME

