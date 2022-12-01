# impractical-sort

Impractical sorting algorithms

* bogosort - Shuffle the given collection and repeat until every elements are in ascending order.

## Usage

* Try small number of elements, or it will never end.
* Only arrays of small positive integers are assumed.

```
(use 'impractical-sort.bogosort)

(time (bogosort [2 0 1 2]))
;; "Elapsed time: 0.10525 msecs"
;; [0 1 2 2]

(time (bogosort [9 6 0 7 1 5 2 3 8 4]))
;; "Elapsed time: 1455.961248 msecs"
;; [0 1 2 3 4 5 6 7 8 9]
```

## License

Copyright (c) 2022 hisaitami
Distributed under the terms of the [MIT License](LICENSE)

