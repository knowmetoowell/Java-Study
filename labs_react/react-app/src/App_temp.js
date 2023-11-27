import logo from './logo.svg';
import './App.css';
import {useState} from 'react'

function Header(props) {
  console.log('props',props.title)
  return(
    <header>
    <h1><a href="/" onClick={(event)=>{
      event.preventDefault();
      props.onChangeMode();}}>
      {props.title}</a></h1>
    </header>
  )
}

function Nav(props){
  const arr = []
  for(let i = 0;i<props.topics.length;i++){
    let t = props.topics[i];
    arr.push(<li key={t.id}>
    <a id={t.id} href={'/read/'+t.id} onClick={event=>{
      event.preventDefault();
      props.onChangeMode(Number(event.target.id));
    }}>{t.title}</a>
    </li>);
    arr.push(<a>{t.body}</a>);
  }
  return (
    <nav>
      <ol>
      {arr}
      </ol>
    </nav>
  )
}
function Article(props){
  return(
    <article>
    <h2>{props.title}</h2>
      {props.body}
    <h3>{props.tail}</h3>
    </article>
  )
}
function Create(props){
  return(
    <article>
      <h2>Create</h2>
      <form onSubmit={event=>{
        event.preventDefault();;
        const title = event.target.title.value;
        const body = event.target.body.value;
        props.onCreate(title,body);
      }}>
      <p><input type="text" name="title" placeholder="title" /></p>
        <p><textarea name="body" placeholder="body"></textarea></p>
        <p><input type="submit" value="Create"></input></p>
        </form>
    </article>
  )
}

function App(){
  const [mode,setMode] = useState('WELCOME');
  const [id,setId] = useState(null);
  const [topics,setTopics] = useState([
    {id:1,title:'IT&E',body:'hyundai IT&E is ...'},
    {id:2,title:'SESACK',body:'sesack Education is ...'},
    {id:3,title:'CSH',body:'The person is ...'},
  ]);
  const[nextId,setNextId] = useState(4);
  let content = null;
  if(mode === 'WELCOME'){
    content = <Article title = "Welcome" body ="Hello, Web"></Article>
  } else if(mode === 'READ'){
    let title,body = null;
    for(let i = 0;i<topics.length;i++){
      console.log(topics[i].id,id);
      if(topics[i].id === id){
        title = topics[i].title;
        body = topics[i].body;
      }
    }
  } else if(mode === 'CREATE'){
    content = <Create onCreate={(_title,_body)=>{
      const newTopic = {id:nextId,title:_title,body:_body}
      const newTopics =[...topics]
      newTopics.push(newTopic);
      setTopics(newTopics);
      setMode('READ');
      setId(nextId);
      setNextId(nextId+1);
    }}></Create>
  }
  // content = <Article title={title} body={body}></Article>
  return (
    <div>
    <Header title="CSH" onChangeMode={()=>{
      setMode('WELCOME');
    }}></Header>
    <Nav topics = {topics} onChangeMode={(_id)=>{
      setMode('READ');
      setId(_id);
    }}></Nav>
    {content}
    <a href='/create' onClick={event=>{
      event.preventDefault();
      setMode('CREATE');
    }}>Create</a>
    </div>
  );
}

export default App;
