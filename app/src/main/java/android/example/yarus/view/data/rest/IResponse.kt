package android.example.yarus.view.data.rest

interface IResponse<T> {
    fun  toDomainObject(): T
}