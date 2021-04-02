package com.example

import com.example.domain.Book
import io.micronaut.retry.annotation.Fallback
import io.reactivex.Flowable

@Fallback
class Service2FallBack implements Service2Client{
    @Override
    Flowable<ArrayList<Book>> findBooks(){
        Book book1 = new Book()
        book1.setTitle("Service 2 is down and will be up shortly")
        return Flowable.just([book1])
    }
}
