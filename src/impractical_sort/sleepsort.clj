(ns impractical-sort.sleepsort)

(defn sleepsort [coll]
  (let [r (atom [])
        size (count coll)
        f (fn [n]
            (Thread/sleep (* n 10))
            (swap! r conj n))]
    (->> (pmap f coll)
         (filter #(= size (count %)))
         first)))

(time (sleepsort [9 6 0 7 1 5 2 3 8 4]))

;; "Elapsed time: 96.301592 msecs"
;; [0 1 2 3 4 5 6 7 8 9]
