//
// heap[0 .. heapSize - 1]
// 最后一个元素为heap[d=heapSize - 1]
// 在heap中，使得下标parent为根的二叉树满足堆特性
void maxHeapify(int *heap, int parent, int heapSize)
{
    int  child = 2 * parent + 1; // parent 的左子结点点
    int temp = heap[parent];
    while (child <= heapSize - 1)    // 沿着二叉树往下筛选
    {
        if (child < heapSize - 1 && heap[child + 1] > heap[child] )    //取较大结点作筛选
        {
            ++ child;
        }
        if (temp < heap[child])
        {   // 未满足堆特性，child结点点做上升操作，并作为新的parent结点
            heap[parent] = heap[child];
            parent = child;
            child = 2 * parent + 1;
        }else{
            // 满足堆特性，结束筛选
            break;
        }
    }
    heap[parent] = temp;    //
}
// 构造一个大根堆
// heap[0 .. heapSize - 1]
// 最后一个元素为heap[d=heapSize - 1]
void buildMaxheap(int *heap,int heapSize)
{
    for (int parent = heapSize / 2 - 1; parent >= 0; parent --)
    {
        maxHeapify(heap,parent,heapSize);
    }
}
void swap(int *a,int i, int j)
{
    if (i == j)
        return;
    int temp = a[i]; a[i] = a[j]; a[j] = temp;
}
void heapSort(int nums[],int numsSize)
{
    buildMaxheap(nums,numsSize);
    for (int i = 1; i <= numsSize - 1; i ++)
    {
        swap(nums,0,numsSize - i);
        buildMaxheap(nums,numsSize - i);
    }
}
