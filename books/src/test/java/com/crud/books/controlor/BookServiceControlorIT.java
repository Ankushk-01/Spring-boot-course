// package com.crud.books.controlor;

// import static com.crud.books.services.BookData.bookTest;

// import org.hibernate.mapping.List;
// import org.junit.Test;
// import org.junit.jupiter.api.extension.ExtendWith;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
// import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.http.MediaType;
// import org.springframework.test.context.junit.jupiter.SpringExtension;
// import org.springframework.test.web.servlet.MockMvc;
// import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
// import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

// import com.crud.books.domain.Book;
// import com.crud.books.services.BookServices;
// import com.fasterxml.jackson.databind.ObjectMapper;

// @SpringBootTest
// @AutoConfigureMockMvc
// @ExtendWith(SpringExtension.class)
// public class BookServiceControlorIT {
//     @Autowired
//     public MockMvc mockMvc;

//     @Autowired
    
//     public BookServices bookServices;
//     @Test
//     public void testThePutMethodCode() throws Exception {
//         final Book book = bookTest();
//         ObjectMapper objectMapper = new ObjectMapper();
//         String bookString = objectMapper.writeValueAsString(book);
//         mockMvc.perform(MockMvcRequestBuilders.put("/book" + book.getIsbn()).contentType(MediaType.APPLICATION_JSON).content(bookString)).andExpect(MockMvcResultMatchers.content().json(":F"));
    
//     }

//     @Test
//     public void testRetriveBook404Found() throws Exception {
//         mockMvc.perform(MockMvcRequestBuilders.get("/book/{isbn}", "book/47845")).andExpect(MockMvcResultMatchers.status().isNotFound());
//     }
//     @Test
//     public void testRetriveBookFoundBook() throws Exception {
//         final Book testBook = bookTest();
//         bookServices.create(testBook);
//         mockMvc.perform(MockMvcRequestBuilders.get("/book/{isbn}", "book/"+testBook.getIsbn())).andExpect(MockMvcResultMatchers.status().isOk())
//         .andExpect(MockMvcResultMatchers.jsonPath("$.isbn").value(testBook.getIsbn()))
//         .andExpect(MockMvcResultMatchers.jsonPath("$.author").value(testBook.getAuthor()))
//         .andExpect(MockMvcResultMatchers.jsonPath("$.title").value(testBook.getTitle()));
//     }

//     @Test
//     public void testThatListsBooksReturnsEmpty() throws Exception{
//         mockMvc.perform(MockMvcRequestBuilders.get("/books")).andExpect(MockMvcResultMatchers.status().isOk());
//     }
//     @Test
//     public void testThatListsBooksReturnsListBooks() throws Exception{
//         final Book testBook = bookTest();
//         bookServices.create(testBook);
//         mockMvc.perform(MockMvcRequestBuilders.get("/books")).andExpect(MockMvcResultMatchers.status().isOk());
//     }
// }
