1 |---

arr = [4,3,1,2,0] ->

	Chunks 1 ->

		After sorting each chunks, [4],[3],[2],[1],[0] -> [4,3,2,1,0] (Not Sorted)

	Chunks 2 -> 

		After sorting each chunks, [4,3], [2,1,0] -> [4,3,2,1,0] (Not sorted)

	Chunks 3 -> 

		After sorting each chunks, [4,3,2],[1,0] -> [2,3,4,0,1] (Not sorted)

	Chunks 4 ->

		After sorting each chunks, [4,3,2,1],[0] -> [1,2,3,4,0] (Not Sorted)

	Chunks 5 ->

		After sorting each chunks, [4,3,2,1,0] -> [0,1,2,3,4] (SORTED) -> +1

Chunks = arr.length() -> 1 ANS

2 |---

arr = [1,0,2,3,4]

	Chunk 1 ->
		After sorting each chunks, [1],[0],[2],[3],[4] -> [1,0,2,3,4] (Not Sorted)

	Chunk 2 ->
		After sorting each chunks, [1,0],[2,3],[4] -> [0,1,2,3,4] (SORTED) +1

	Chunk 3 -> 
		After sorting each chunks, [1,0,2],[3,4] -> [0,1,2,3,4] (SORTED) +1

	Chunk 4 ->
		After sorting each chunks, [1,0,2,3],[4] -> [0,1,2,3,4] (SORTED) +1

	Chunk 5 -> 
		After sorting each chunks, [1,0,2,3,4] -> [0,1,2,3,4] (SORTED) +1

Chunks = arr.length -> 4 ANS