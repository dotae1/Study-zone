# 이진 탐색(Binary Search)란?
<hr>

##### 1. 이진 탐색 = 정렬된 배열 또는 리스트에 적합한 고속 탐색 방법이다.</li>
-  배열의 중앙에 있는 값을 조사하여 찾고하 하는 항목이 왼쪽 또는 오른쪽 부분 배열에 있는지를 알아내어 탐색의 범위를 반으로 줄인다.
- 찾고자 하는 값이 속해있지 않은 부분은 전혀 고려할 필요가 없기 때문에, 매 단계에서 검색해야 할 리스트의 크기를 반으로 줄일 수 있다.
- 이러한 방법을 반복적으로 탐색하는 방법이 이진 탐색이다.
- 데이터의 삽입이나 삭제가 빈번할 시에는 적합하지 않고, 주로 고정된 데이터에 대한 탐색에 적합하다.
- 이진 탐색은 정렬된 데이터에서만 가능하기에, 먼저 정렬된 배열, 리스트에 사용하는게 적합하다.

##### 2. 이진 탐색의 구현
###### 2-1 배열로 구현
- 탐색의 대상이 되는 자료들이 array[low] 에서분터 array[high]에 들어있다고 가정하자. <br> 
범위는 low ~ high까지이고, low에는 0번의 index 값, high에는 n-1의 index값이 들어간다.</br>
<br>
- low와 high값에 의거해 중간값 mid의 값은 (low+high)/2 이다.
</br><br>
- array[mid] 값과 구하고자 하는 key값을 비교한다. <br>3-1. key > mid : 구학고자 하는 값이 중간값보다 높다면 low를 mid+1로 만들어 준다.(왼쪽의 반을 버림)</br>
<br>3-2. key < mid : 구하고자 하는 값이 중간값보다 낮다면 high를 mid - 1로 만들어준다.(오른쪽의 반을 버림)_</br>
<br>3-3. key==mid : 구하고자 하는 값을 찾았으므로 중간값을 리턴한다.</br>
<br>
- low > high가 될 때까지 반복하면서 구하고자 하는 값을 찾는다.
<br><hr><br>

   
  ![](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FcqSVub%2Fbtq5lyj0hdx%2FuueqouAwXkPUcQGJrFgEo0%2Fimg.png)

<code>
예시) key = 32 low = 0, high =9 이므로 mid = (0+9)/2 =4 (정수는 오버플로우 방지를 위해 소수점 이하 버림을 주로 사용한다고 함)
</code>


<code>
1. key > mid 이므로 low = mid+1 = 5
2. mid = (5+9)/2 = 7
</code>

![](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FcTdRoI%2Fbtq5fDmvXe8%2F5zi2DU9psPgWYAVaLcZvGK%2Fimg.png)
<code>
1. key < mid 이므로 high = mid-1 = 6
2. mid = (5+6)/2 = 5
   </code>

![](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FKjVE5%2Fbtq5gvPmCiP%2FuTyoNRu1MuoKkgXpGb6ckK%2Fimg.png)
<code>
1. high = mid-1 = 6, low = 5
2. mid = (5+6)/2 = 10 (소수점 버림)

![](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2F0vmuK%2Fbtq5gvBOldB%2FxeNJojg5kJyJpFNi3jL3t1%2Fimg.png)
<code>
1. mid와 key값 비교
2. mid == key이므로 탐색 종료
</code>

###### 2-2. 재귀함수 & 반복함수
#### 반복함수 예제코드.
>입력이 클 때 빠르고 안정적이며 메모리 효율이 좋다.


    public static int binarySearch(int[] arr, int low, int high, int target) {
    if (low > high) return -1;  // 종료 조건 (못 찾으면 끝!)
    int mid = low + (high - low) / 2;
    if (arr[mid] == target) return mid;  // 찾음!
    else if (arr[mid] < target) 
        return binarySearch(arr, mid + 1, high, target);  // 오른쪽으로 가라!
    else
        return binarySearch(arr, low, mid - 1, target);  // 왼쪽으로 가라!
    }


#### 재귀함수 예제코드.

    public static int binarySearch(int[] arr, int target) {
    int low = 0, high = arr.length - 1;

    while (low <= high) {  // 탐색 범위가 존재하는 동안 반복
        int mid = low + (high - low) / 2;

        if (arr[mid] == target) return mid;  // 찾으면 반환
        else if (arr[mid] < target) low = mid + 1;  // 오른쪽으로 이동
        else high = mid - 1;  // 왼쪽으로 이동
    }
    return -1;  // 못 찾았을 경우
    }

##### 3. 종료 조건 & 시간 복잡도
- 종료조건
1. 검색을 성공할 경우 (array[mid]==key)
2. 검색을 실패할 경우 ( 더이상 검색할 범위가 없을 경우, low>high)

- 시간복잡도 <br>
>이진 탐색의 시간 복잡도는 최선의 경우에는 찾는 값이 중간에 있을때 O(1)이며,<br>
최악의 경우 탐색을 실시할 때마다 범위를 절반으로 줄여 나가기 때문에 O(log N)이다.


#### 4. 이진 탐색 트리(BST)
- 이진 탐색 트리는 이진 탐색을 효율적으로 구현할 수 있는 자료구조이다.
- 왼쪽 노드들의 값은 루트 노드의 값보다 작고, 오른쪽 노드의 값은 루트 노드의 값보다 크다.

![](https://blog.kakaocdn.net/dn/ec9EZD/btqAOcsCkwF/6Q5kGtpUf6uiwgpDuxZ0jk/img.png)

![](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FuDHQH%2FbtqAOcMY6EB%2Fvyb3LZDCgyiAlisXBcngu0%2Fimg.png)

#### 4-1. 이진 탐색 트리에서의 삽입 & 삭제
- 삽입

![](https://hyeminnoh.github.io/Tech-Stack/assets/img/binarytree_add.7b47550b.jpg)

- 삭제
1. 삭제할 값이 리프노드(자식노드가 없는 경우)인 경우



2. 삭제할 값이 중간노드인 경우 (각 노드의 값이 왼쪽 서브트리의 모든 값보다 작고, 오른쪽 서브트리의 모든 값보다 크다라는 특성을 유지해야 함)
>삭제할 노드가 리프 노드인 경우, 해당 노드를 직접 삭제합니다. <br>
삭제할 노드가 자식 노드를 1개 가지고 있는 경우, 해당 노드를 자식 노드로 대체합니다. <br>
삭제할 노드가 자식 노드를 2개 가지고 있는 경우, 왼쪽 서브트리의 최대값 또는 오른쪽 서브트리의 최소값으로 대체합니다.

![](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FcBBe0S%2FbtqARx22gTs%2FzZkp7WaE93K2DMDyWV8N20%2Fimg.png)

3. 삭제할 값이 자식노드가 2개인 경우

![](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FcqTzsm%2FbtqAQ39bwci%2FkZ7KJshiWY9t0VkB4weW5K%2Fimg.png)

#### 4-2. 삽입 & 삭제가 필요한 이유
-  삽입 & 삭제가 빈번한 경우 이진 탐색 연산이 적합하지 않다고 했는데 이진 탐색 트리에서 삽입 & 삭제가 가능한 이유는 다음과 같다.
>이진 탐색 트리의 특성상 노드의 값은 항상 정렬된 상태를 유지합니다.
> 그런데 실제 애플리케이션에서는 데이터가 정적이지 않고 동적으로 변경될 수 있습니다. 예를 들어, 새로운 데이터를 추가하거나 기존 데이터를 삭제해야 할 수 있습니다.
이 경우 이진 탐색 트리에서 삽입과 제거 연산이 필요합니다. 새로운 노드를 삽입할 때는 이진 탐색 트리의 특성을 유지하도록 해야 하고, 노드를 제거할 때도 트리의 구조를 유지해야 합니다.
즉, 이진 탐색 트리는 정렬된 데이터에 대한 효율적인 검색을 지원하는 동시에, 동적인 데이터 변경에도 대응할 수 있도록 설계된 자료 구조입니다. 따라서 삽입과 제거 연산은 이진 탐색 트리의 핵심 기능이라고 할 수 있습니다.

>하지만 배열은 삽입 & 추가가 발생할 시 다시 정렬해야 해서 성능이 저하되기 때문에 정렬된 데이터에 대한 빠른 검색을 위해 설계된 자료 구조이며, 
> 삽입/삭제 연산보다는 검색 연산이 중요합니다. 반면 이진 탐색 트리는 기본적으로 정렬된 상태를 유지하기에 삽입 & 삭제가 가능하다는 점이 가장 큰 차이점인거같다.
<br>

#### 5. 이진 탐색을 사용할 수 있는 변형 알고리즘
- Lower Bound: 찾고자 하는 값 이상의 최소 값을 찾는 알고리즘
- Upper Bound: 찾고자 하는 값 초과의 최소 값을 찾는 알고리즘
- Ceiling: 찾고자 하는 값 이상의 최소 값을 찾는 알고리즘
- Floor: 찾고자 하는 값 이하의 최대 값을 찾는 알고리즘