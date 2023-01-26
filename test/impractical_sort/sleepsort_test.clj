(ns impractical-sort.sleepsort-test
  (:require [clojure.test :refer [deftest is]]
            [impractical-sort.sleepsort :refer [sleepsort]]))

(deftest sleepsort-test
  (let [coll [9 6 0 7 1 5 2 3 8 4]]
    (is (= (sort coll) (sleepsort coll))))
  (let [coll [4 3 1 3 39 3 4 3 9 6 0 7 1 5 2 3 8 4]]
    (is (= (sort coll) (sleepsort coll)))))
