import React from 'react';

class Posts extends React.Component {
  state = {
    posts: []
  };
  
  loadPosts() {
    const posts = [
      { id: 1, title: "React Basics" },
      { id: 2, title: "Component Lifecycle" },
      { id: 3, title: "Hooks" }
    ];

    this.setState({ posts });
  }

  componentDidMount() {
    this.loadPosts();
  }

  componentDidCatch(error, info) {
    console.log(error, info);
  }

render() {
    return (
      <div>
        <h2>Posts</h2>

        {this.state.posts.map(post => (
          <p key={post.id}>{post.title}</p>
        ))}
      </div>
    );
  }
}

export default Posts;