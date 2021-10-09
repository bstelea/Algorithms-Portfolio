import math, sys
from typing import List

class Heap():
    len = 0
    heapSize = 0
    content = []

    def __init__(self) -> None:
        pass

    def __init__(self, len: int, heapSize: int, content: List[int]) -> None:
        self.len = len
        self.heapSize = heapSize
        self.content = content

    # O(1) procedure
    def parent(self, i: int) -> int:
        return math.floor(i / 2)
    
    # O(1) procedure
    def left(self, i: int) -> int:
        return 2 * i + 1
    
    # O(1) procedure
    def right(self, i: int) -> int:
        return 2 * i + 2

    # O(lg n) procedure
    def maxHeapify(self, i: int) -> None:
        l = self.left(i)
        r = self.right(i)
        largest = i
        if l < self.heapSize and self.content[l] > self.content[i]:
            largest = l
        if r < self.heapSize and self.content[r] > self.content[largest]:
            largest = r
        if largest != i:
            aux = self.content[i]
            self.content[i] = self.content[largest]
            self.content[largest] = aux
            self.maxHeapify(largest)

    # O(n) procedure
    def buildMaxHeap(self):
        self.heapSize = self.len
        for i in range(math.floor(self.len / 2) - 1, -1, -1):
            self.maxHeapify(i)

    # O(n lg n) procedure
    def heapSort(self):
        self.buildMaxHeap()
        for i in range(self.len - 1, 0, -1):
            aux = self.content[0]
            self.content[0] = self.content[i]
            self.content[i] = aux
            self.heapSize -= 1
            self.maxHeapify(0)

    # The following 4 procedures allow the heap data structure to implement a (max-)priority queue
    # Def: A **Proirity Queue** is a data structure used for maintaining a set S of elements, each with 
    #      with an associated value called a **key**.
    # Use: A **Max-Priority Queue** can be used to schedule jobs on a shared computer. 
    # Use: A **Min-Priority Queue** can be used in an event-driven simulator. 
    
    # O(lg n) procedure
    def maxHeapInsert(self, key: int) -> None:
        self.heapSize += 1
        self.content[self.heapSize - 1] = -sys.maxsize - 1
        self.heapIncreaseKey(self.heapSize - 1, key)

    # O(lg n) procedure
    def heapExtractMax(self) -> int:
        if self.heapSize < 1:
            raise NameError("Heap Underflow!")
        maximum = self.content[0]
        self.content[0] = self.content[self.heapSize - 1]
        self.heapSize -= 1
        self.maxHeapify(0)
        return maximum

    # O(lg n) procedure
    def heapIncreaseKey(self, i: int, key: int) -> None:
        if key < self.content[i]:
            raise NameError("New key is smaller than current key!")
        self.content[i] = key
        parent = self.parent(i)
        while i > 0 and self.content[parent] < self.content[i]:
            aux =  self.content[i]
            self.content[i] = self.content[parent]
            self.content[parent] = aux
            i = parent

    # O(1) procedure
    def heapMaximum(self) -> int:
        return self.content[0]



if __name__ == "__main__":
    heap = Heap(16, 10, [16, 4, 10, 14, 7, 9, 3, 2, 8, 1])
    print("Heap content: {}".format(heap.content))
    heap.maxHeapify(1)
    print("Heap content after maxHeapify(1): {}".format(heap.content))
    heap2 = Heap(10, 0, [4, 1, 3, 2, 16, 9, 10, 14, 8, 7])
    print("Heap2 content: {}".format(heap2.content))
    heap2.buildMaxHeap()
    print("Heap2 content after calling buildMaxHeap(): {}".format(heap2.content))
    heap3 = Heap(10, 10, [16, 14, 10, 8, 7, 9, 3, 2, 4, 1])
    print("Heap3 content: {}".format(heap3.content))
    heap3.heapSort()
    print("Heap3 content after calling heapSort(): {}".format(heap3.content))
    

