import ReactDOM from 'react-dom/client'
import App from './Index.jsx'
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Feed from './Feed';


ReactDOM.createRoot(document.getElementById('root')).render(
  <Router>
  <Routes>
    <Route exact path="/"  element={<App />}  />
    <Route path="/feed" element={<Feed />}  />
  </Routes>
</Router>
)
