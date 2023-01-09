(ns impractical-sort.bogosort)

(defn ascending? [coll]
  (apply <= coll))

(defn descending? [coll]
  (apply >= coll))

(defn bogosort
  "Returns a sorted sequence of the items in coll.
  However keep shuffling until a given coll is sorted."
  ([coll]
   (bogosort ascending? coll))
  ([pred coll]
   (if (pred coll) coll
       (recur pred (shuffle coll)))))

;;(time (bogosort [9 6 0 7 1 5 2 3 8 4]))
;;"Elapsed time: 6937.974985 msecs"
;;[0 1 2 3 4 5 6 7 8 9]
