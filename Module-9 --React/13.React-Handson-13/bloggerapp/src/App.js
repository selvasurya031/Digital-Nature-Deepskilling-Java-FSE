import React from "react";
import { books, courses, blogs } from "./data";

function App() {

  const bookdet = (
    <ul>
      {books.map((book) => (
        <li key={book.id}>
          <h3>{book.bname}</h3>
          <h4>{book.price}</h4>
        </li>
      ))}
    </ul>
  );

  const coursedet = (
    <ul>
      {courses.map((course) => (
        <li key={course.id}>
          <h3>{course.cname}</h3>
          <h4>{course.date}</h4>
        </li>
      ))}
    </ul>
  );

  const content = (
    <div>
      {blogs.map((blog) => (
        <div key={blog.id}>
          <h3>{blog.title}</h3>
          <h4>{blog.author}</h4>
          <p>{blog.content}</p>
        </div>
      ))}
    </div>
  );

  return (
    <div>
      <div className="st2">
        <h1>Book Details</h1>
        {bookdet}
      </div>

      <div className="v1">
        <h1>Blog Details</h1>
        {content}
      </div>

      <div className="mystyle1">
        <h1>Course Details</h1>
        {coursedet}
      </div>
    </div>
  );
}

export default App;