# impractical-sort

Impractical sorting algorithms

* bogosort - Shuffle the given collection and repeat until every elements are in ascending order.
* sleepsort - For each element x in the given positive integer array, sleep x milliseconds and add x to the result vector.

## Usage

* Try small number of elements, or it will never end.
* Only arrays of small positive integers are assumed.

### bogosort

```
=> (use 'impractical-sort.bogosort)

;; It takes a time
=> (time (bogosort [9 6 0 7 1 5 2 3 8 4]))
"Elapsed time: 1455.961248 msecs"
[0 1 2 3 4 5 6 7 8 9]

;; Specify pred function explicitly
=> (bogosort ascending? [9 6 0 7 1 5 2 3 8 4])
[0 1 2 3 4 5 6 7 8 9]

;; Reverse sorting
=> (bogosort descending? [9 6 0 7 1 5 2 3 8 4])
[9 8 7 6 5 4 3 2 1 0]

;; Generate any bogosorted sequence
=> (bogosort #(ascending? (take 10 %)) [11 0 5 18 17 19 14 9 1 7 10 13 15 3 8 4 12 16 6 2])
[0 1 2 5 9 10 11 14 15 16 19 6 12 17 8 7 3 18 13 4]

;; Sort strings
=> (bogosort ["Dave" "Alice" "Ellen" "Charlie" "Bob" "Frank"])
["Alice" "Bob" "Charlie" "Dave" "Ellen" "Frank"]
```

### sleepsort

```
(use 'impractical-sort.sleepsort)

(time (sleepsort [3 2 0 1])
;; "Elapsed time: 51.449746 msecs"
;; [0 1 2 3]

(time (sleepsort [9 6 0 7 1 5 2 3 8 4]))
;; "Elapsed time: 94.665742 msecs"
;; [0 1 2 3 4 5 6 7 8 9]
```

## License

Copyright (c) 2023 hisaitami
Distributed under the terms of the [MIT License](LICENSE)

