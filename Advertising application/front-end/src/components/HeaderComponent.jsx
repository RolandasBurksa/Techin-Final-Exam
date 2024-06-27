import { NavLink, useNavigate } from "react-router-dom";

const HeaderComponent = () => {
  // const navigate = useNavigate();

  // function addNewAdvert() {
  //   navigate("/add-advert");
  // }

  return (
    <div>
      <header>
        <nav className="navbar navbar-expand-lg navbar-dark bg-primary">
          <div>
            <a
              href="http://localhost:3000"
              className="navbar-brand"
              style={{ paddingLeft: "20px" }}
            >
              Advert online Application
            </a>
          </div>
          <div className="collapse navbar-collapse" id="navbarNav">
            <ul className="navbar-nav">
              <li className="nav-item">
                <NavLink className="nav-link" to="/adverts">
                  Adverts
                </NavLink>
              </li>

              <li className="nav-item">
                <NavLink className="nav-link" to="/categories">
                  Categories
                </NavLink>
              </li>
            </ul>
          </div>
          {/* <div className="collapse navbar-collapse">
            <ul className="navbar-nav">
              <li className="nav-item">
                <NavLink to="/register" className="nav-link">
                  Register
                </NavLink>
              </li>
            </ul>
          </div> */}
          <ul className="navbar-nav">
            <li className="nav-item" style={{ paddingRight: "20px" }}>
              <NavLink to="/register" className="nav-link">
                Register
              </NavLink>
            </li>
          </ul>

          <ul className="navbar-nav">
            <li className="nav-item" style={{ paddingRight: "20px" }}>
              <NavLink to="/login" className="nav-link">
                Login
              </NavLink>
            </li>
          </ul>

          <ul className="navbar-nav">
            <li className="nav-item" style={{ paddingRight: "20px" }}>
              <NavLink to="/login" className="nav-link">
                Logout
              </NavLink>
            </li>
          </ul>
          {/* <button
            className="btn btn-outline-light mb-2"
            style={{ marginTop: "10px", marginLeft: "20px" }}
            onClick={addNewBook}
          >
            Add Book
          </button> */}

          <button
            className="users-initials"
            style={{
              marginLeft: "10px",
              marginRight: " 10px",
              padding: "10px",
              background: "white",
              borderRadius: "50%",
            }}
          >
            {/* {getInitials(usernameOrEmail)} */}
          </button>
        </nav>
      </header>
    </div>
  );
};

export default HeaderComponent;
