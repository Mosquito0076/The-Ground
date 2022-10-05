import { Row } from "react-bootstrap";
import Radar from "./Radar";

import style from "../css/HitterDetailModal.module.css";

const HitterDetailModal = (props) => {
  const { hitter } = props;

  // 타율 출루율 장타율 볼넷 삼진
  const data = [
    {
      taste: "타율",
      chardonay: hitter.avg,
    },
    {
      taste: "출루율",
      chardonay: hitter.obp,
    },
    {
      taste: "장타율",
      chardonay: hitter.slg,
    },
  ];

  return (
    <>
      <Row className={style["modal"]}>
        <Row className={style["head"]}>
          <div>{props.hitter.hitterName}</div>
        </Row>
        <Row className={style["body"]}>
          <Row>
            <Radar data={data} />
          </Row>
          <Row className={style["stat"]}></Row>
        </Row>
      </Row>
    </>
  );
};

export default HitterDetailModal;
