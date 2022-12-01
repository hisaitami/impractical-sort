(ns impractical-sort.bogosort-test
  (:require [clojure.test :refer :all]
            [impractical-sort.bogosort :refer [ascending? bogosort]]))

(deftest ascending-test
  (is (true? (ascending? [0])))
  (is (false? (ascending? [1 0])))
  (is (true? (ascending? [0 1 2])))
  (is (true? (ascending? [0 1 1 2 2 3])))
  (is (false? (ascending? [0 1 1 3 2]))))

(deftest bogosort-test
  (let [coll [9 6 0 7 1 5 2 3 8 4]]
    (is (= (sort coll) (bogosort coll)))))
