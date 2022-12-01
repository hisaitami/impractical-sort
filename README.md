# impractical-sort

Impractical sorting algorithms

* bogosort - Shuffle the given collection and repeat until every elements are in ascending order.
* sleepsort - For each element x in the given positive integer array, sleep x milliseconds and add x to the result vector.

## Usage

* Try small number of elements, or it will never end.
* Only arrays of small positive integers are assumed.

### bogosort

```
(use 'impractical-sort.bogosort)

(time (bogosort [2 0 1 2]))
;; "Elapsed time: 0.10525 msecs"
;; [0 1 2 2]

(time (bogosort [9 6 0 7 1 5 2 3 8 4]))
;; "Elapsed time: 1455.961248 msecs"
;; [0 1 2 3 4 5 6 7 8 9]
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

Copyright (c) 2022 hisaitami
Distributed under the terms of the [MIT License](LICENSE)

