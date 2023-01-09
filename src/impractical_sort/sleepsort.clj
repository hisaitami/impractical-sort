(ns impractical-sort.sleepsort)

(def delay-factor-msec 10) ; Adjust for consistent results

(defn sleepsort [coll]
  (let [r (atom [])
        f (fn [n]
            (Thread/sleep (* n delay-factor-msec))
            (swap! r conj n))]
    (doall (pmap f coll))
    @r))

;;(time (sleepsort [9 6 0 7 1 5 2 3 8 4]))

;; "Elapsed time: 96.301592 msecs"
;; [0 1 2 3 4 5 6 7 8 9]
