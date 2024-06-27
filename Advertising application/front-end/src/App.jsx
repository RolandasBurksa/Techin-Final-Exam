import { BrowserRouter, Route, Routes } from "react-router-dom";
import "./App.css";
import AdvertComponent from "./components/AdvertComponent";
import FooterComponent from "./components/FooterComponent";
import HeaderComponent from "./components/HeaderComponent";
import ListAdvertsComponent from "./components/ListAdvertsComponent";

function App() {
  return (
    <>
      <BrowserRouter>
        <HeaderComponent />
        <Routes>
          {/* // http://localhost:3000/add-advert */}
          <Route path="/add-advert" element={<AdvertComponent />}></Route>
          {/* // http://localhost:3000/adverts */}
          <Route path="/adverts" element={<ListAdvertsComponent />}></Route>
        </Routes>
        <FooterComponent />
      </BrowserRouter>
    </>
  );
}

export default App;
