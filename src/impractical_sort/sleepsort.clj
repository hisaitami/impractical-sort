(ns impractical-sort.sleepsort)

(defn sleepsort [coll]
  (letfn [(f [n]
            (Thread/sleep (* 10 n))
            (print n))]
    (pmap f coll)))

(time (sleepsort [9 6 0 7 1 5 2 3 8 4]))

;; 0"Elapsed time: 0.62599 msecs"
;; (nil nil nil nil nil nil nil nil nil nil)
;; 123456789 <- FIXME: 0 is shown above line
